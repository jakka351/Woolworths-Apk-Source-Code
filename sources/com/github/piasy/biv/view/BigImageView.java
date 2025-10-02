package com.github.piasy.biv.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.dynatrace.android.callback.Callback;
import com.github.piasy.biv.BigImageViewer;
import com.github.piasy.biv.R;
import com.github.piasy.biv.indicator.ProgressIndicator;
import com.github.piasy.biv.loader.ImageLoader;
import com.github.piasy.biv.loader.glide.PrefetchTarget;
import com.github.piasy.biv.utils.DisplayOptimizeListener;
import com.github.piasy.biv.utils.ThreadedCallbacks;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;

@Keep
/* loaded from: classes4.dex */
public class BigImageView extends FrameLayout implements ImageLoader.Callback {
    public static final int DEFAULT_IMAGE_SCALE_TYPE = 3;
    public static final ImageView.ScaleType[] IMAGE_SCALE_TYPES = {ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_XY};
    public static final int INIT_SCALE_TYPE_CENTER = 0;
    public static final int INIT_SCALE_TYPE_CENTER_CROP = 1;
    public static final int INIT_SCALE_TYPE_CENTER_INSIDE = 2;
    public static final int INIT_SCALE_TYPE_CUSTOM = 7;
    public static final int INIT_SCALE_TYPE_FIT_CENTER = 3;
    public static final int INIT_SCALE_TYPE_FIT_END = 4;
    public static final int INIT_SCALE_TYPE_FIT_START = 5;
    public static final int INIT_SCALE_TYPE_FIT_XY = 6;
    public static final int INIT_SCALE_TYPE_START = 8;
    private File mCurrentImageFile;
    private boolean mDelayMainImageForTransition;
    private DisplayOptimizeListener mDisplayOptimizeListener;
    private final View.OnClickListener mFailureImageClickListener;
    private ImageView.ScaleType mFailureImageScaleType;
    private ImageView mFailureImageView;
    private final ImageLoader mImageLoader;
    private ImageSaveCallback mImageSaveCallback;
    private ImageShownCallback mImageShownCallback;
    private int mInitScaleType;
    private final ImageLoader.Callback mInternalCallback;
    private View mMainView;
    private View.OnClickListener mOnClickListener;
    private View.OnLongClickListener mOnLongClickListener;
    private boolean mOptimizeDisplay;
    private ProgressIndicator mProgressIndicator;
    private View mProgressIndicatorView;
    private SubsamplingScaleImageView mSSIV;
    private boolean mTapToRetry;
    private Uri mThumbnail;
    private ImageView.ScaleType mThumbnailScaleType;
    private View mThumbnailView;
    private final Handler mUiHandler;
    private Uri mUri;
    private ImageLoader.Callback mUserCallback;
    private ImageViewFactory mViewFactory;

    public BigImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailAndProgressIndicator() {
        View view = this.mThumbnailView;
        if (view != null) {
            removeView(view);
            this.mThumbnailView = null;
        }
        View view2 = this.mProgressIndicatorView;
        if (view2 != null) {
            removeView(view2);
            this.mProgressIndicatorView = null;
        }
    }

    @UiThread
    private void doOnFinish() {
        if (!this.mOptimizeDisplay) {
            clearThumbnailAndProgressIndicator();
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        View view = this.mThumbnailView;
        if (view != null) {
            view.setAnimation(animationSet);
        }
        View view2 = this.mProgressIndicatorView;
        if (view2 != null) {
            view2.setAnimation(animationSet);
        }
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.github.piasy.biv.view.BigImageView.3
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                BigImageView bigImageView = BigImageView.this;
                if (bigImageView.mThumbnailView != null) {
                    bigImageView.mThumbnailView.setVisibility(8);
                }
                if (bigImageView.mProgressIndicatorView != null) {
                    bigImageView.mProgressIndicatorView.setVisibility(8);
                }
                if (bigImageView.mThumbnailView == null && bigImageView.mProgressIndicatorView == null) {
                    return;
                }
                bigImageView.post(new Runnable() { // from class: com.github.piasy.biv.view.BigImageView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BigImageView.this.clearThumbnailAndProgressIndicator();
                    }
                });
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    @UiThread
    private void doShowImage(int i, File file, boolean z) {
        if (z) {
            View view = this.mThumbnailView;
            if (view != null) {
                removeView(view);
            }
            ImageViewFactory imageViewFactory = this.mViewFactory;
            Context context = getContext();
            ImageView.ScaleType scaleType = this.mThumbnailScaleType;
            imageViewFactory.getClass();
            ImageView imageView = new ImageView(context);
            if (scaleType != null) {
                imageView.setScaleType(scaleType);
            }
            this.mThumbnailView = imageView;
            addView(imageView, -1, -1);
            this.mThumbnailView.setOnClickListener(this.mOnClickListener);
            this.mThumbnailView.setOnLongClickListener(this.mOnLongClickListener);
            View view2 = this.mThumbnailView;
            if (view2 instanceof ImageView) {
                this.mViewFactory.getClass();
                ((ImageView) view2).setImageURI(Uri.fromFile(file));
                ImageShownCallback imageShownCallback = this.mImageShownCallback;
                if (imageShownCallback != null) {
                    imageShownCallback.b();
                }
            }
        } else {
            View view3 = this.mMainView;
            if (view3 != null) {
                removeView(view3);
            }
            ImageViewFactory imageViewFactory2 = this.mViewFactory;
            Context context2 = getContext();
            imageViewFactory2.getClass();
            View viewA = (i == 1 || i == 2) ? null : imageViewFactory2.a(context2);
            this.mMainView = viewA;
            if (viewA == null) {
                onFail(new RuntimeException("Image type not supported: ".concat(i != 1 ? i != 2 ? i != 3 ? "STILL_IMAGE" : "STILL_WEBP" : "ANIMATED_WEBP" : "GIF")));
                return;
            }
            addView(viewA, -1, -1);
            this.mMainView.setOnClickListener(this.mOnClickListener);
            this.mMainView.setOnLongClickListener(this.mOnLongClickListener);
            View view4 = this.mMainView;
            if (view4 instanceof SubsamplingScaleImageView) {
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) view4;
                this.mSSIV = subsamplingScaleImageView;
                subsamplingScaleImageView.setMinimumTileDpi(160);
                setOptimizeDisplay(this.mOptimizeDisplay);
                setInitScaleType(this.mInitScaleType);
            }
            this.mViewFactory.getClass();
            if (i == 1 || i == 2) {
                this.mViewFactory.getClass();
            } else {
                ImageViewFactory imageViewFactory3 = this.mViewFactory;
                View view5 = this.mMainView;
                Uri uriFromFile = Uri.fromFile(file);
                imageViewFactory3.getClass();
                if (view5 instanceof SubsamplingScaleImageView) {
                    ((SubsamplingScaleImageView) view5).setImage(ImageSource.uri(uriFromFile));
                }
            }
            ImageShownCallback imageShownCallback2 = this.mImageShownCallback;
            if (imageShownCallback2 != null) {
                imageShownCallback2.a();
            }
        }
        ImageView imageView2 = this.mFailureImageView;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @WorkerThread
    private void fireSaveImageCallback(String str, Throwable th) {
        ImageSaveCallback imageSaveCallback = this.mImageSaveCallback;
        if (imageSaveCallback != null) {
            this.mUiHandler.post(new Runnable(th, imageSaveCallback, str) { // from class: com.github.piasy.biv.view.BigImageView.2
                public final /* synthetic */ Throwable d;
                public final /* synthetic */ ImageSaveCallback e;

                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th2 = this.d;
                    ImageSaveCallback imageSaveCallback2 = this.e;
                    if (th2 != null) {
                        imageSaveCallback2.a();
                    } else {
                        imageSaveCallback2.onSuccess();
                    }
                }
            });
        }
    }

    public static ImageView.ScaleType scaleType(int i) {
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = IMAGE_SCALE_TYPES;
            if (i < scaleTypeArr.length) {
                return scaleTypeArr[i];
            }
        }
        return IMAGE_SCALE_TYPES[3];
    }

    @UiThread
    private void showFailImage() {
        if (this.mFailureImageView == null) {
            return;
        }
        View view = this.mMainView;
        if (view != null) {
            removeView(view);
        }
        this.mFailureImageView.setVisibility(0);
        clearThumbnailAndProgressIndicator();
    }

    public void cancel() {
        this.mImageLoader.b(hashCode());
    }

    public File getCurrentImageFile() {
        return this.mCurrentImageFile;
    }

    public View getMainView() {
        return this.mMainView;
    }

    public SubsamplingScaleImageView getSSIV() {
        return this.mSSIV;
    }

    public void loadMainImageNow() {
        this.mDelayMainImageForTransition = false;
        this.mImageLoader.a(hashCode(), this.mUri, this.mInternalCallback);
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onCacheHit(int i, File file) {
        this.mCurrentImageFile = file;
        doShowImage(i, file, this.mDelayMainImageForTransition);
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onCacheHit(i, file);
        }
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onCacheMiss(int i, File file) {
        this.mCurrentImageFile = file;
        doShowImage(i, file, this.mDelayMainImageForTransition);
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onCacheMiss(i, file);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancel();
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onFail(Exception exc) {
        showFailImage();
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onFail(exc);
        }
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onFinish() {
        doOnFinish();
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onFinish();
        }
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onProgress(int i) {
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onProgress(i);
        }
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onStart() {
        if (this.mThumbnail != Uri.EMPTY) {
            ImageViewFactory imageViewFactory = this.mViewFactory;
            Context context = getContext();
            ImageView.ScaleType scaleType = this.mThumbnailScaleType;
            imageViewFactory.getClass();
            ImageView imageView = new ImageView(context);
            if (scaleType != null) {
                imageView.setScaleType(scaleType);
            }
            this.mThumbnailView = imageView;
            this.mViewFactory.getClass();
            View view = this.mThumbnailView;
            if (view != null) {
                addView(view, -1, -1);
            }
        }
        ProgressIndicator progressIndicator = this.mProgressIndicator;
        if (progressIndicator != null) {
            this.mProgressIndicatorView = progressIndicator.a(this);
            this.mProgressIndicator.getClass();
            View view2 = this.mProgressIndicatorView;
            if (view2 != null) {
                addView(view2);
            }
        }
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onStart();
        }
    }

    @Override // com.github.piasy.biv.loader.ImageLoader.Callback
    public void onSuccess(File file) {
        ImageLoader.Callback callback = this.mUserCallback;
        if (callback != null) {
            callback.onSuccess(file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:22:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0084 A[EXC_TOP_SPLITTER, PHI: r0 r2 r3
  0x0084: PHI (r0v11 boolean) = (r0v10 boolean), (r0v15 boolean) binds: [B:43:0x0094, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r2v7 ??) = (r2v6 ??), (r2v13 ??) binds: [B:43:0x0094, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r3v4 android.net.Uri) = (r3v3 android.net.Uri), (r3v7 android.net.Uri) binds: [B:43:0x0094, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream] */
    @androidx.annotation.RequiresPermission
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void saveImageIntoGallery() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.piasy.biv.view.BigImageView.saveImageIntoGallery():void");
    }

    public void setFailureImage(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (this.mFailureImageView == null) {
            ImageView imageView = new ImageView(getContext());
            this.mFailureImageView = imageView;
            imageView.setVisibility(8);
            this.mFailureImageView.setOnClickListener(this.mFailureImageClickListener);
            ImageView.ScaleType scaleType = this.mFailureImageScaleType;
            if (scaleType != null) {
                this.mFailureImageView.setScaleType(scaleType);
            }
            addView(this.mFailureImageView);
        }
        this.mFailureImageView.setImageDrawable(drawable);
    }

    public void setFailureImageInitScaleType(ImageView.ScaleType scaleType) {
        this.mFailureImageScaleType = scaleType;
    }

    public void setImageLoaderCallback(ImageLoader.Callback callback) {
        this.mUserCallback = callback;
    }

    public void setImageSaveCallback(ImageSaveCallback imageSaveCallback) {
        this.mImageSaveCallback = imageSaveCallback;
    }

    public void setImageShownCallback(ImageShownCallback imageShownCallback) {
        this.mImageShownCallback = imageShownCallback;
    }

    public void setImageViewFactory(ImageViewFactory imageViewFactory) {
        if (imageViewFactory == null) {
            return;
        }
        this.mViewFactory = imageViewFactory;
    }

    public void setInitScaleType(int i) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.mSSIV;
        if (subsamplingScaleImageView == null) {
            return;
        }
        this.mInitScaleType = i;
        if (i == 1) {
            subsamplingScaleImageView.setMinimumScaleType(2);
        } else if (i == 7) {
            subsamplingScaleImageView.setMinimumScaleType(3);
        } else if (i != 8) {
            subsamplingScaleImageView.setMinimumScaleType(1);
        } else {
            subsamplingScaleImageView.setMinimumScaleType(4);
        }
        DisplayOptimizeListener displayOptimizeListener = this.mDisplayOptimizeListener;
        if (displayOptimizeListener != null) {
            displayOptimizeListener.b = i;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        View view = this.mMainView;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnLongClickListener = onLongClickListener;
        View view = this.mMainView;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOptimizeDisplay(boolean z) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.mSSIV;
        if (subsamplingScaleImageView == null) {
            return;
        }
        this.mOptimizeDisplay = z;
        if (!z) {
            this.mDisplayOptimizeListener = null;
            subsamplingScaleImageView.setOnImageEventListener(null);
        } else {
            DisplayOptimizeListener displayOptimizeListener = new DisplayOptimizeListener(subsamplingScaleImageView);
            this.mDisplayOptimizeListener = displayOptimizeListener;
            subsamplingScaleImageView.setOnImageEventListener(displayOptimizeListener);
        }
    }

    public void setProgressIndicator(ProgressIndicator progressIndicator) {
        this.mProgressIndicator = progressIndicator;
    }

    public void setTapToRetry(boolean z) {
        this.mTapToRetry = z;
    }

    public void setThumbnailScaleType(ImageView.ScaleType scaleType) {
        this.mThumbnailScaleType = scaleType;
    }

    public void showImage(Uri uri) {
        showImage(Uri.EMPTY, uri);
    }

    public BigImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void showImage(Uri uri, Uri uri2) {
        showImage(uri, uri2, false);
    }

    public BigImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUiHandler = new Handler(Looper.getMainLooper());
        this.mDelayMainImageForTransition = false;
        this.mFailureImageClickListener = new View.OnClickListener() { // from class: com.github.piasy.biv.view.BigImageView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BigImageView bigImageView = BigImageView.this;
                Callback.g(view);
                try {
                    if (bigImageView.mTapToRetry) {
                        bigImageView.showImage(bigImageView.mThumbnail, bigImageView.mUri);
                    } else if (bigImageView.mOnClickListener != null) {
                        bigImageView.mOnClickListener.onClick(view);
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f14351a, i, 0);
        this.mInitScaleType = typedArrayObtainStyledAttributes.getInteger(2, 3);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.mFailureImageScaleType = scaleType(typedArrayObtainStyledAttributes.getInteger(1, 3));
            setFailureImage(typedArrayObtainStyledAttributes.getDrawable(0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            this.mThumbnailScaleType = scaleType(typedArrayObtainStyledAttributes.getInteger(5, 3));
        }
        this.mOptimizeDisplay = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.mTapToRetry = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.mImageLoader = null;
        } else if (BigImageViewer.b != null) {
            this.mImageLoader = BigImageViewer.b.f14350a;
        } else {
            throw new IllegalStateException("You must initialize BigImageViewer before use it!");
        }
        this.mInternalCallback = (ImageLoader.Callback) ThreadedCallbacks.create(ImageLoader.Callback.class, this);
        this.mViewFactory = new ImageViewFactory();
    }

    public void showImage(Uri uri, Uri uri2, boolean z) {
        this.mThumbnail = uri;
        this.mUri = uri2;
        clearThumbnailAndProgressIndicator();
        this.mDelayMainImageForTransition = z;
        if (z) {
            Uri[] uriArr = {uri2};
            if (BigImageViewer.b != null) {
                BigImageViewer.b.f14350a.c(uriArr[0], new PrefetchTarget());
                this.mImageLoader.a(hashCode(), uri, this.mInternalCallback);
            } else {
                throw new IllegalStateException("You must initialize BigImageViewer before use it!");
            }
        } else {
            this.mImageLoader.a(hashCode(), uri2, this.mInternalCallback);
        }
        ImageView imageView = this.mFailureImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}

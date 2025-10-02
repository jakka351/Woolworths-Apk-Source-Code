package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final c t = new c();
    public final LottieListener g;
    public final LottieListener h;
    public LottieListener i;
    public int j;
    public final LottieDrawable k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final HashSet q;
    public final HashSet r;
    public LottieTask s;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String d;
        public int e;
        public float f;
        public boolean g;
        public String h;
        public int i;
        public int j;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.d = parcel.readString();
                savedState.f = parcel.readFloat();
                savedState.g = parcel.readInt() == 1;
                savedState.h = parcel.readString();
                savedState.i = parcel.readInt();
                savedState.j = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeFloat(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeString(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UserActionTaken {
        public static final UserActionTaken d;
        public static final UserActionTaken e;
        public static final UserActionTaken f;
        public static final UserActionTaken g;
        public static final UserActionTaken h;
        public static final UserActionTaken i;
        public static final /* synthetic */ UserActionTaken[] j;

        static {
            UserActionTaken userActionTaken = new UserActionTaken("SET_ANIMATION", 0);
            d = userActionTaken;
            UserActionTaken userActionTaken2 = new UserActionTaken("SET_PROGRESS", 1);
            e = userActionTaken2;
            UserActionTaken userActionTaken3 = new UserActionTaken("SET_REPEAT_MODE", 2);
            f = userActionTaken3;
            UserActionTaken userActionTaken4 = new UserActionTaken("SET_REPEAT_COUNT", 3);
            g = userActionTaken4;
            UserActionTaken userActionTaken5 = new UserActionTaken("SET_IMAGE_ASSETS", 4);
            h = userActionTaken5;
            UserActionTaken userActionTaken6 = new UserActionTaken("PLAY_OPTION", 5);
            i = userActionTaken6;
            j = new UserActionTaken[]{userActionTaken, userActionTaken2, userActionTaken3, userActionTaken4, userActionTaken5, userActionTaken6};
        }

        public static UserActionTaken valueOf(String str) {
            return (UserActionTaken) Enum.valueOf(UserActionTaken.class, str);
        }

        public static UserActionTaken[] values() {
            return (UserActionTaken[]) j.clone();
        }
    }

    public static class WeakFailureListener implements LottieListener<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f13340a;

        public WeakFailureListener(LottieAnimationView lottieAnimationView) {
            this.f13340a = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13340a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i = lottieAnimationView.j;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            LottieListener lottieListener = lottieAnimationView.i;
            if (lottieListener == null) {
                lottieListener = LottieAnimationView.t;
            }
            lottieListener.onResult(th);
        }
    }

    public static class WeakSuccessListener implements LottieListener<LottieComposition> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f13341a;

        public WeakSuccessListener(LottieAnimationView lottieAnimationView) {
            this.f13341a = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            LottieComposition lottieComposition = (LottieComposition) obj;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f13341a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(lottieComposition);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new WeakSuccessListener(this);
        this.h = new WeakFailureListener(this);
        this.j = 0;
        this.k = new LottieDrawable();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = new HashSet();
        this.r = new HashSet();
        f(null, com.woolworths.R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        LottieResult lottieResult = lottieTask.d;
        LottieDrawable lottieDrawable = this.k;
        if (lottieResult != null && lottieDrawable == getDrawable() && lottieDrawable.d == lottieResult.f13347a) {
            return;
        }
        this.q.add(UserActionTaken.d);
        this.k.d();
        e();
        lottieTask.b(this.g);
        lottieTask.a(this.h);
        this.s = lottieTask;
    }

    public final void c(KeyPath keyPath, ColorFilter colorFilter, final SimpleLottieValueCallback simpleLottieValueCallback) {
        this.k.a(keyPath, colorFilter, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object a(LottieFrameInfo lottieFrameInfo) {
                return simpleLottieValueCallback.a(lottieFrameInfo);
            }
        });
    }

    public final void d() {
        this.o = false;
        this.q.add(UserActionTaken.i);
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.j.clear();
        lottieDrawable.e.cancel();
        if (lottieDrawable.isVisible()) {
            return;
        }
        lottieDrawable.i = LottieDrawable.OnVisibleAction.d;
    }

    public final void e() {
        LottieTask lottieTask = this.s;
        if (lottieTask != null) {
            LottieListener lottieListener = this.g;
            synchronized (lottieTask) {
                lottieTask.f13348a.remove(lottieListener);
            }
            LottieTask lottieTask2 = this.s;
            LottieListener lottieListener2 = this.h;
            synchronized (lottieTask2) {
                lottieTask2.b.remove(lottieListener2);
            }
        }
    }

    public final void f(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f13350a, i, 0);
        this.p = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.o = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        LottieDrawable lottieDrawable = this.k;
        if (z) {
            lottieDrawable.e.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f = typedArrayObtainStyledAttributes.getFloat(13, BitmapDescriptorFactory.HUE_RED);
        if (zHasValue4) {
            this.q.add(UserActionTaken.e);
        }
        lottieDrawable.x(f);
        lottieDrawable.h(typedArrayObtainStyledAttributes.getBoolean(7, false));
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            lottieDrawable.a(new KeyPath("**"), LottieProperty.F, new LottieValueCallback(new SimpleColorFilter(ContextCompat.c(typedArrayObtainStyledAttributes.getResourceId(5, -1), getContext()).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(15, 0);
            if (i2 >= RenderMode.values().length) {
                i2 = 0;
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i3 >= RenderMode.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(AsyncUpdates.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        this.q.add(UserActionTaken.i);
        this.k.n();
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.k.Q;
        return asyncUpdates != null ? asyncUpdates : AsyncUpdates.d;
    }

    public boolean getAsyncUpdatesEnabled() {
        AsyncUpdates asyncUpdates = this.k.Q;
        if (asyncUpdates == null) {
            asyncUpdates = AsyncUpdates.d;
        }
        return asyncUpdates == AsyncUpdates.e;
    }

    public boolean getClipTextToBoundingBox() {
        return this.k.A;
    }

    public boolean getClipToCompositionBounds() {
        return this.k.u;
    }

    @Nullable
    public LottieComposition getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.k;
        if (drawable == lottieDrawable) {
            return lottieDrawable.d;
        }
        return null;
    }

    public long getDuration() {
        LottieComposition composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.k.e.k;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.k.l;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.k.t;
    }

    public float getMaxFrame() {
        return this.k.e.d();
    }

    public float getMinFrame() {
        return this.k.e.e();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.k.d;
        if (lottieComposition != null) {
            return lottieComposition.f13342a;
        }
        return null;
    }

    @FloatRange
    public float getProgress() {
        return this.k.e.c();
    }

    public RenderMode getRenderMode() {
        return this.k.C ? RenderMode.f : RenderMode.e;
    }

    public int getRepeatCount() {
        return this.k.e.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.k.e.getRepeatMode();
    }

    public float getSpeed() {
        return this.k.e.g;
    }

    public final void h() {
        this.q.add(UserActionTaken.i);
        this.k.p();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof LottieDrawable) {
            boolean z = ((LottieDrawable) drawable).C;
            RenderMode renderMode = RenderMode.f;
            if ((z ? renderMode : RenderMode.e) == renderMode) {
                this.k.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.k;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.o) {
            return;
        }
        this.k.n();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.l = savedState.d;
        HashSet hashSet = this.q;
        UserActionTaken userActionTaken = UserActionTaken.d;
        if (!hashSet.contains(userActionTaken) && !TextUtils.isEmpty(this.l)) {
            setAnimation(this.l);
        }
        this.m = savedState.e;
        if (!hashSet.contains(userActionTaken) && (i = this.m) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(UserActionTaken.e)) {
            this.k.x(savedState.f);
        }
        if (!hashSet.contains(UserActionTaken.i) && savedState.g) {
            g();
        }
        if (!hashSet.contains(UserActionTaken.h)) {
            setImageAssetsFolder(savedState.h);
        }
        if (!hashSet.contains(UserActionTaken.f)) {
            setRepeatMode(savedState.i);
        }
        if (hashSet.contains(UserActionTaken.g)) {
            return;
        }
        setRepeatCount(savedState.j);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.l;
        savedState.e = this.m;
        LottieDrawable lottieDrawable = this.k;
        LottieValueAnimator lottieValueAnimator = lottieDrawable.e;
        LottieValueAnimator lottieValueAnimator2 = lottieDrawable.e;
        savedState.f = lottieValueAnimator.c();
        if (lottieDrawable.isVisible()) {
            z = lottieValueAnimator2.p;
        } else {
            LottieDrawable.OnVisibleAction onVisibleAction = lottieDrawable.i;
            z = onVisibleAction == LottieDrawable.OnVisibleAction.e || onVisibleAction == LottieDrawable.OnVisibleAction.f;
        }
        savedState.g = z;
        savedState.h = lottieDrawable.l;
        savedState.i = lottieValueAnimator2.getRepeatMode();
        savedState.j = lottieValueAnimator2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(@RawRes final int i) {
        LottieTask<LottieComposition> lottieTaskE;
        this.m = i;
        this.l = null;
        if (isInEditMode()) {
            lottieTaskE = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this;
                    boolean z = lottieAnimationView.p;
                    int i2 = i;
                    if (!z) {
                        return LottieCompositionFactory.f(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return LottieCompositionFactory.f(context, i2, LottieCompositionFactory.k(i2, context));
                }
            }, true);
        } else if (this.p) {
            Context context = getContext();
            lottieTaskE = LottieCompositionFactory.e(context, i, LottieCompositionFactory.k(i, context));
        } else {
            lottieTaskE = LottieCompositionFactory.e(getContext(), i, null);
        }
        setCompositionTask(lottieTaskE);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(LottieCompositionFactory.a(null, new Callable() { // from class: com.airbnb.lottie.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.c(byteArrayInputStream, null);
            }
        }, new g(byteArrayInputStream, 0)));
    }

    public void setAnimationFromUrl(String str) {
        LottieTask<LottieComposition> lottieTaskA;
        int i = 0;
        String str2 = null;
        if (this.p) {
            Context context = getContext();
            HashMap map = LottieCompositionFactory.f13343a;
            String strA = YU.a.A("url_", str);
            lottieTaskA = LottieCompositionFactory.a(strA, new e(str, strA, context, i), null);
        } else {
            lottieTaskA = LottieCompositionFactory.a(null, new e(str, str2, getContext(), i), null);
        }
        setCompositionTask(lottieTaskA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.k.z = z;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.k.Q = asyncUpdates;
    }

    public void setCacheComposition(boolean z) {
        this.p = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        LottieDrawable lottieDrawable = this.k;
        if (z != lottieDrawable.A) {
            lottieDrawable.A = z;
            lottieDrawable.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        LottieDrawable lottieDrawable = this.k;
        if (z != lottieDrawable.u) {
            lottieDrawable.u = z;
            CompositionLayer compositionLayer = lottieDrawable.v;
            if (compositionLayer != null) {
                compositionLayer.J = z;
            }
            lottieDrawable.invalidateSelf();
        }
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.setCallback(this);
        this.n = true;
        boolean zQ = lottieDrawable.q(lottieComposition);
        if (this.o) {
            lottieDrawable.n();
        }
        this.n = false;
        if (getDrawable() != lottieDrawable || zQ) {
            if (!zQ) {
                boolean zK = lottieDrawable.k();
                setImageDrawable(null);
                setImageDrawable(lottieDrawable);
                if (zK) {
                    lottieDrawable.p();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                ((LottieOnCompositionLoadedListener) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.p = str;
        FontAssetManager fontAssetManagerJ = lottieDrawable.j();
        if (fontAssetManagerJ != null) {
            fontAssetManagerJ.e = str;
        }
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.i = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.j = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.k.q = fontAssetDelegate;
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        LottieDrawable lottieDrawable = this.k;
        if (map == lottieDrawable.o) {
            return;
        }
        lottieDrawable.o = map;
        lottieDrawable.invalidateSelf();
    }

    public void setFrame(int i) {
        this.k.r(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.k.g = z;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.m = imageAssetDelegate;
        ImageAssetManager imageAssetManager = lottieDrawable.k;
        if (imageAssetManager != null) {
            imageAssetManager.c = imageAssetDelegate;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.k.l = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.m = 0;
        this.l = null;
        e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.m = 0;
        this.l = null;
        e();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.m = 0;
        this.l = null;
        e();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.k.t = z;
    }

    public void setMaxFrame(int i) {
        this.k.s(i);
    }

    public void setMaxProgress(@FloatRange float f) {
        LottieDrawable lottieDrawable = this.k;
        LottieComposition lottieComposition = lottieDrawable.d;
        if (lottieComposition == null) {
            lottieDrawable.j.add(new o(lottieDrawable, f, 0));
            return;
        }
        LottieValueAnimator lottieValueAnimator = lottieDrawable.e;
        lottieValueAnimator.i(lottieValueAnimator.m, MiscUtils.e(lottieComposition.l, lottieComposition.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.k.u(str);
    }

    public void setMinFrame(int i) {
        this.k.v(i);
    }

    public void setMinProgress(float f) {
        LottieDrawable lottieDrawable = this.k;
        LottieComposition lottieComposition = lottieDrawable.d;
        if (lottieComposition == null) {
            lottieDrawable.j.add(new o(lottieDrawable, f, 1));
        } else {
            lottieDrawable.v((int) MiscUtils.e(lottieComposition.l, lottieComposition.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        LottieDrawable lottieDrawable = this.k;
        if (lottieDrawable.y == z) {
            return;
        }
        lottieDrawable.y = z;
        CompositionLayer compositionLayer = lottieDrawable.v;
        if (compositionLayer != null) {
            compositionLayer.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.x = z;
        LottieComposition lottieComposition = lottieDrawable.d;
        if (lottieComposition != null) {
            lottieComposition.f13342a.f13349a = z;
        }
    }

    public void setProgress(@FloatRange float f) {
        this.q.add(UserActionTaken.e);
        this.k.x(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        LottieDrawable lottieDrawable = this.k;
        lottieDrawable.B = renderMode;
        lottieDrawable.e();
    }

    public void setRepeatCount(int i) {
        this.q.add(UserActionTaken.g);
        this.k.e.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.q.add(UserActionTaken.f);
        this.k.e.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.k.h = z;
    }

    public void setSpeed(float f) {
        this.k.e.g = f;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.k.r = textDelegate;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.k.e.q = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.n && drawable == (lottieDrawable = this.k) && lottieDrawable.k()) {
            this.o = false;
            lottieDrawable.m();
        } else if (!this.n && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.k()) {
                lottieDrawable2.m();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.k.t(str);
    }

    public void setMinFrame(String str) {
        this.k.w(str);
    }

    public void setAnimation(final String str) {
        LottieTask<LottieComposition> lottieTaskA;
        this.l = str;
        this.m = 0;
        int i = 1;
        if (isInEditMode()) {
            lottieTaskA = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.d;
                    boolean z = lottieAnimationView.p;
                    String str2 = str;
                    if (!z) {
                        return LottieCompositionFactory.b(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = LottieCompositionFactory.f13343a;
                    return LottieCompositionFactory.b(context, str2, "asset_" + str2);
                }
            }, true);
        } else {
            String str2 = null;
            if (this.p) {
                Context context = getContext();
                HashMap map = LottieCompositionFactory.f13343a;
                String strA = YU.a.A("asset_", str);
                lottieTaskA = LottieCompositionFactory.a(strA, new e(str, strA, context.getApplicationContext(), i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = LottieCompositionFactory.f13343a;
                lottieTaskA = LottieCompositionFactory.a(null, new e(str, str2, context2.getApplicationContext(), i), null);
            }
        }
        setCompositionTask(lottieTaskA);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new WeakSuccessListener(this);
        this.h = new WeakFailureListener(this);
        this.j = 0;
        this.k = new LottieDrawable();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = new HashSet();
        this.r = new HashSet();
        f(attributeSet, com.woolworths.R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new WeakSuccessListener(this);
        this.h = new WeakFailureListener(this);
        this.j = 0;
        this.k = new LottieDrawable();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = new HashSet();
        this.r = new HashSet();
        f(attributeSet, i);
    }
}

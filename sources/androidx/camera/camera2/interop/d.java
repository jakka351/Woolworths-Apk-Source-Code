package androidx.camera.camera2.interop;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Process;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.d;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.LiveDataPublisher;
import androidx.lifecycle.PublisherLiveData;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.paging.LivePagedList;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.SavedCreditCardViewHolder;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.digipay.framesview.CardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView$initialiseWebView$1;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1;
import au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerFragment;
import au.com.woolworths.feature.shop.barcode.scanner.ScannerHandler;
import au.com.woolworths.feature.shop.barcode.scanner.databinding.FragmentCameraViewBinding;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.pay.sdk.web.StepUpView;
import au.com.woolworths.shop.lists.databinding.EpoxyItemShoppingListTextBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import com.adobe.marketing.mobile.services.PersistentHitQueue;
import com.airbnb.epoxy.paging3.PagedDataModelCache;
import com.airbnb.epoxy.paging3.PagedListModelCache;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import com.google.common.util.concurrent.ListenableFuture;
import com.woolworths.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import timber.log.Timber;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(FramesWebView.Callback callback, int i) {
        this.d = 18;
        this.e = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        final int i = 0;
        final int i2 = 1;
        switch (this.d) {
            case 0:
                Camera2CameraControl camera2CameraControl = (Camera2CameraControl) this.e;
                CallbackToFutureAdapter.Completer completer = camera2CameraControl.g;
                if (completer != null) {
                    completer.b(null);
                    camera2CameraControl.g = null;
                    return;
                }
                return;
            case 1:
                ((CameraStateRegistry.OnOpenAvailableListener) this.e).a();
                return;
            case 2:
                ((CameraStateRegistry.OnConfigureAvailableListener) this.e).a();
                return;
            case 3:
                ((ListenableFuture) this.e).cancel(true);
                return;
            case 4:
                Runnable runnable = (Runnable) this.e;
                Process.setThreadPriority(-16);
                runnable.run();
                return;
            case 5:
                ((CallbackToFutureAdapter.Completer) this.e).b(null);
                return;
            case 6:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.e;
                dualSurfaceProcessor.i = true;
                dualSurfaceProcessor.c();
                return;
            case 7:
                DualSurfaceProcessorNode.Out out = ((DualSurfaceProcessorNode) this.e).d;
                if (out != null) {
                    Iterator<SurfaceEdge> it = out.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    return;
                }
                return;
            case 8:
                Carousel carousel = (Carousel) this.e;
                MotionLayout motionLayout = carousel.u;
                int i3 = carousel.H;
                motionLayout.setTransitionDuration(i3);
                if (carousel.G < carousel.t) {
                    carousel.u.E(carousel.z, i3);
                    return;
                } else {
                    carousel.u.E(carousel.A, i3);
                    return;
                }
            case 9:
                LiveDataPublisher.LiveDataSubscription liveDataSubscription = (LiveDataPublisher.LiveDataSubscription) this.e;
                if (liveDataSubscription.f) {
                    throw null;
                }
                liveDataSubscription.h = null;
                return;
            case 10:
                Throwable th = (Throwable) this.e;
                int i4 = PublisherLiveData.LiveDataSubscriber.e;
                throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
            case 11:
                DefaultAnalyticsCollector defaultAnalyticsCollector = (DefaultAnalyticsCollector) this.e;
                AnalyticsListener.EventTime eventTimeO0 = defaultAnalyticsCollector.o0();
                defaultAnalyticsCollector.t0(eventTimeO0, 1028, new androidx.camera.core.internal.a((Object) eventTimeO0, 18));
                defaultAnalyticsCollector.i.d();
                return;
            case 12:
                LivePagedList this$0 = (LivePagedList) this.e;
                Intrinsics.h(this$0, "this$0");
                this$0.n(true);
                return;
            case 13:
                ((AtomicBoolean) this.e).set(true);
                return;
            case 14:
                ((AnimatedVectorDrawableCompat) this.e).start();
                return;
            case 15:
                StepUpView stepUpViewC = ((SavedCreditCardViewHolder) this.e).c();
                stepUpViewC.getClass();
                stepUpViewC.d(new JSONObject());
                return;
            case 16:
                final AppCompatActivity appCompatActivity = (AppCompatActivity) this.e;
                try {
                    new AlertDialog.Builder(appCompatActivity).setTitle(R.string.login_prompt_title).setMessage(R.string.login_prompt_message).setNegativeButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.android.onesite.utils.a
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            switch (i) {
                                case 0:
                                    AppCompatActivity context = appCompatActivity;
                                    Intrinsics.h(context, "context");
                                    Intent intentPutExtra = Activities.MainActivity.f4487a.b().putExtra("EXTRA_LAUNCH_LOGIN_PAGE", false);
                                    context.startActivity(intentPutExtra);
                                    Intrinsics.g(intentPutExtra, "apply(...)");
                                    break;
                                default:
                                    AppCompatActivity context2 = appCompatActivity;
                                    Intrinsics.h(context2, "context");
                                    Intent intentPutExtra2 = Activities.MainActivity.f4487a.b().putExtra("EXTRA_LAUNCH_LOGIN_PAGE", true);
                                    context2.startActivity(intentPutExtra2);
                                    Intrinsics.g(intentPutExtra2, "apply(...)");
                                    break;
                            }
                        }
                    }).setPositiveButton(R.string.login, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.android.onesite.utils.a
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            switch (i2) {
                                case 0:
                                    AppCompatActivity context = appCompatActivity;
                                    Intrinsics.h(context, "context");
                                    Intent intentPutExtra = Activities.MainActivity.f4487a.b().putExtra("EXTRA_LAUNCH_LOGIN_PAGE", false);
                                    context.startActivity(intentPutExtra);
                                    Intrinsics.g(intentPutExtra, "apply(...)");
                                    break;
                                default:
                                    AppCompatActivity context2 = appCompatActivity;
                                    Intrinsics.h(context2, "context");
                                    Intent intentPutExtra2 = Activities.MainActivity.f4487a.b().putExtra("EXTRA_LAUNCH_LOGIN_PAGE", true);
                                    context2.startActivity(intentPutExtra2);
                                    Intrinsics.g(intentPutExtra2, "apply(...)");
                                    break;
                            }
                        }
                    }).setCancelable(false).show();
                    return;
                } catch (IllegalStateException e) {
                    Bark.f8483a.d(new ReportOwner(ReportOwner.Squad.m), e, "Failed to show Logout dialog.", null);
                    return;
                }
            case 17:
                WPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 wPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 = ((CardCaptureFramesView) this.e).o;
                if (wPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1 != null) {
                    wPayPaymentUiKt$WPayPaymentUi$1$6$2$1$1.f6143a.invoke();
                    return;
                }
                return;
            case 18:
                FramesWebView.Callback callback = (FramesWebView.Callback) this.e;
                int i5 = FramesWebView$initialiseWebView$1.b;
                callback.getClass();
                return;
            case 19:
                BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) this.e;
                barcodeScannerFragment.e = (ProcessCameraProvider) ((ListenableFuture) barcodeScannerFragment.h.getD()).get();
                CameraSelector.Builder builder = new CameraSelector.Builder();
                builder.a(1);
                CameraSelector cameraSelector = new CameraSelector(builder.f396a);
                MutableOptionsBundle mutableOptionsBundle = new ImageAnalysis.Builder().f404a;
                mutableOptionsBundle.G(ImageAnalysisConfig.I, 0);
                mutableOptionsBundle.G(ImageAnalysisConfig.H, 0);
                ImageAnalysisConfig imageAnalysisConfig = new ImageAnalysisConfig(OptionsBundle.U(mutableOptionsBundle));
                ImageOutputConfig.J(imageAnalysisConfig);
                ImageAnalysis imageAnalysis = new ImageAnalysis(imageAnalysisConfig);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                ScannerHandler scannerHandler = barcodeScannerFragment.f;
                if (scannerHandler == null) {
                    Intrinsics.p("handler");
                    throw null;
                }
                imageAnalysis.G(executorServiceNewSingleThreadExecutor, scannerHandler.h3());
                barcodeScannerFragment.g = imageAnalysis;
                Preview previewF = new Preview.Builder().f();
                FragmentCameraViewBinding fragmentCameraViewBinding = barcodeScannerFragment.d;
                if (fragmentCameraViewBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                previewF.F(fragmentCameraViewBinding.y.getSurfaceProvider());
                try {
                    ProcessCameraProvider processCameraProvider = barcodeScannerFragment.e;
                    if (processCameraProvider == null) {
                        Intrinsics.p("cameraProvider");
                        throw null;
                    }
                    processCameraProvider.g();
                    ProcessCameraProvider processCameraProvider2 = barcodeScannerFragment.e;
                    if (processCameraProvider2 != null) {
                        processCameraProvider2.b(barcodeScannerFragment, cameraSelector, previewF, barcodeScannerFragment.g);
                        return;
                    } else {
                        Intrinsics.p("cameraProvider");
                        throw null;
                    }
                } catch (IllegalArgumentException e2) {
                    Timber.f27013a.e("Given camera selector unable to bind camera provider: " + e2, new Object[0]);
                    return;
                } catch (IllegalStateException e3) {
                    Timber.f27013a.e("Bind camera provider failed: " + e3, new Object[0]);
                    return;
                }
            case 20:
                ShoppingListDetailsListController.buildNewTextListItemModel$lambda$8$lambda$7$lambda$6((EpoxyItemShoppingListTextBinding) this.e);
                return;
            case 21:
                final EditText editText = (EditText) this.e;
                if (editText.getWidth() == 0) {
                    editText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.EditTextExtKt$startTextShimmer$1$1
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            EditText editText2 = editText;
                            editText2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            Intrinsics.h(editText2, "<this>");
                            editText2.post(new d(editText2, 21));
                        }
                    });
                    return;
                }
                final TextPaint paint = editText.getPaint();
                editText.setTextColor(-13576587);
                final int[] iArr = {-13576587, -256, -13576587};
                final float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
                final float width = editText.getWidth() * 0.3f;
                final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-width, editText.getWidth());
                valueAnimatorOfFloat.setDuration(3000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animation) {
                        Intrinsics.h(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        paint.setShader(new LinearGradient(fFloatValue, BitmapDescriptorFactory.HUE_RED, fFloatValue + width, BitmapDescriptorFactory.HUE_RED, iArr, fArr, Shader.TileMode.CLAMP));
                        EditText editText2 = editText;
                        editText2.setText(editText2.getText());
                    }
                });
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.EditTextExtKt$startTextShimmer$1$3
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animation) {
                        Intrinsics.h(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        Intrinsics.h(animation, "animation");
                        paint.setShader(null);
                        EditText editText2 = editText;
                        editText2.setTextColor(-13576587);
                        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), -13576587, -12303292);
                        valueAnimatorOfObject.setDuration(1000L);
                        valueAnimatorOfObject.addUpdateListener(new au.com.woolworths.shop.addtolist.utils.a(editText2, 1));
                        valueAnimatorOfObject.start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animation) {
                        Intrinsics.h(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        Intrinsics.h(animation, "animation");
                    }
                });
                valueAnimatorOfFloat.start();
                editText.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.utils.EditTextExtKt$startTextShimmer$1$4
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        EditText editText2 = editText;
                        if (editText2.isAttachedToWindow()) {
                            return true;
                        }
                        valueAnimatorOfFloat.cancel();
                        editText2.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                });
                return;
            case 22:
                UnlockSlider.d((UnlockSlider) this.e);
                return;
            case 23:
                PersistentHitQueue persistentHitQueue = (PersistentHitQueue) this.e;
                persistentHitQueue.e.set(false);
                persistentHitQueue.f();
                return;
            case 24:
                PagedDataModelCache this$02 = (PagedDataModelCache) this.e;
                Intrinsics.h(this$02, "this$0");
                synchronized (this$02) {
                    Collections.fill(this$02.d, null);
                }
                return;
            case 25:
                PagedListModelCache this$03 = (PagedListModelCache) this.e;
                Intrinsics.h(this$03, "this$0");
                synchronized (this$03) {
                    Collections.fill(this$03.d, null);
                }
                return;
            case 26:
                ((CarouselLayoutManager) this.e).l1();
                return;
            case 27:
                ((MaterialBackOrchestrator) this.e).a(true);
                return;
            case 28:
                ((LauncherActivity) this.e).e = true;
                return;
            default:
                throw new RuntimeException((String) this.e);
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}

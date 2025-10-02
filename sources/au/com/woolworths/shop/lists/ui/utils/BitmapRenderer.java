package au.com.woolworths.shop.lists.ui.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/utils/BitmapRenderer;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BitmapRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final BitmapRenderer f12485a = new BitmapRenderer();

    public static Object b(Window window, SuspendLambda suspendLambda) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(suspendLambda));
        cancellableContinuationImpl.o();
        View rootView = window.getDecorView().getRootView();
        final Handler handler = new Handler(rootView.getContext().getMainLooper());
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[2];
        rootView.getLocationInWindow(iArr);
        int i = iArr[0];
        PixelCopy.request(window, new Rect(i, iArr[1], rootView.getWidth() + i, rootView.getHeight() + iArr[1]), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: au.com.woolworths.shop.lists.ui.utils.BitmapRenderer$captureScreen$2$1
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i2) {
                if (i2 != 0) {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.Barker.i(new ReportOwner(ReportOwner.Squad.j), "Capture screen content failed, result code: " + i2, null, 12);
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                Bitmap bitmap = bitmapCreateBitmap;
                bitmap.compress(compressFormat, 100, byteArrayOutputStream);
                bitmap.recycle();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.g(byteArray, "toByteArray(...)");
                cancellableContinuationImpl.resumeWith(byteArray);
            }
        }, handler);
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: au.com.woolworths.shop.lists.ui.utils.BitmapRenderer$captureScreen$2$2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                handler.removeCallbacksAndMessages(null);
                bitmapCreateBitmap.recycle();
                return Unit.f24250a;
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final byte[] bitmapByteArray, Composer composer, final int i) {
        int i2;
        Intrinsics.h(bitmapByteArray, "bitmapByteArray");
        ComposerImpl composerImplV = composer.v(-1109775678);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(bitmapByteArray) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(bitmapByteArray);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = BitmapFactory.decodeByteArray(bitmapByteArray, 0, bitmapByteArray.length);
                composerImplV.A(objG);
            }
            Bitmap bitmap = (Bitmap) objG;
            composerImplV.V(false);
            if (bitmap == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(this) { // from class: au.com.woolworths.shop.lists.ui.utils.a
                        public final /* synthetic */ BitmapRenderer e;

                        {
                            this.e = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    this.e.a(bitmapByteArray, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                                default:
                                    this.e.a(bitmapByteArray, composer2, RecomposeScopeImplKt.a(i | 1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(bitmap);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                if (Build.VERSION.SDK_INT < 31) {
                    RenderScript renderScriptCreate = RenderScript.create(context);
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    scriptIntrinsicBlurCreate.setRadius(18.0f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                    allocationCreateTyped.copyTo(bitmap);
                    renderScriptCreate.destroy();
                }
                composerImplV.A(bitmap);
            } else {
                bitmap = objG2;
            }
            composerImplV.V(false);
            AndroidImageBitmap androidImageBitmap = new AndroidImageBitmap(bitmap);
            FillElement fillElement = SizeKt.c;
            composerImplV.o(-1342494998);
            int i4 = Build.VERSION.SDK_INT;
            Modifier modifierA = Modifier.Companion.d;
            if (i4 >= 31) {
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(29);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                modifierA = GraphicsLayerModifierKt.a(modifierA, (Function1) objG3);
            }
            composerImplV.V(false);
            Modifier modifierX0 = fillElement.x0(modifierA);
            boolean zN3 = composerImplV.n(androidImageBitmap);
            Object objG4 = composerImplV.G();
            if (zN3 || objG4 == Composer.Companion.f1624a) {
                objG4 = BitmapPainterKt.a(androidImageBitmap, 1);
                composerImplV.A(objG4);
            }
            ImageKt.a((BitmapPainter) objG4, null, modifierX0, Alignment.Companion.e, ContentScale.Companion.b, 1.0f, null, composerImplV, 48, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            recomposeScopeImplX2.d = new Function2(this) { // from class: au.com.woolworths.shop.lists.ui.utils.a
                public final /* synthetic */ BitmapRenderer e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            this.e.a(bitmapByteArray, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            this.e.a(bitmapByteArray, composer2, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}

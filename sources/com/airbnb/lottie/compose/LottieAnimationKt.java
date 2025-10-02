package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "setDynamicProperties", "", "progress", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LottieAnimationKt {
    public static final void a(final LottieComposition lottieComposition, Modifier modifier, LottieClipSpec lottieClipSpec, int i, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z, Composer composer, final int i2, final int i3, final int i4) {
        ComposerImpl composerImplV = composer.v(-1151869807);
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.Companion.d : modifier;
        final LottieClipSpec lottieClipSpec2 = (i4 & 16) != 0 ? null : lottieClipSpec;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        LottieDynamicProperties lottieDynamicProperties2 = (i4 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i4 & 16384) != 0 ? Alignment.Companion.e : alignment;
        ContentScale contentScale2 = (32768 & i4) != 0 ? ContentScale.Companion.b : contentScale;
        boolean z2 = (65536 & i4) != 0 ? true : z;
        final LottieAnimatable lottieAnimatableA = AnimateLottieCompositionAsStateKt.a(lottieComposition, lottieClipSpec2, i5, composerImplV, 896);
        composerImplV.F(185157520);
        boolean zN = composerImplV.n(lottieAnimatableA);
        Object objG = composerImplV.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(((Number) lottieAnimatableA.getD()).floatValue());
                }
            };
            composerImplV.A(objG);
        }
        composerImplV.V(false);
        int i6 = i2 >> 12;
        int i7 = i3 >> 15;
        b(lottieComposition, (Function0) objG, modifier2, false, false, false, RenderMode.d, false, lottieDynamicProperties2, alignment2, contentScale2, z2, false, null, AsyncUpdates.d, false, composerImplV, (896 & (i2 << 3)) | 134217736 | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | ((i3 << 15) & 1879048192), (i7 & 14) | 4096 | (i7 & 112), 0);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final int i8 = i5;
            final Modifier modifier3 = modifier2;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final Alignment alignment3 = alignment2;
            final ContentScale contentScale3 = contentScale2;
            final boolean z3 = z2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    LottieAnimationKt.a(lottieComposition, modifier3, lottieClipSpec2, i8, lottieDynamicProperties3, alignment3, contentScale3, z3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final LottieComposition lottieComposition, final Function0 progress, final Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, boolean z6, Map map, AsyncUpdates asyncUpdates, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        Intrinsics.h(progress, "progress");
        ComposerImpl composerImplV = composer.v(-674272918);
        final boolean z8 = (i3 & 8) != 0 ? false : z;
        final boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        final RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.d : renderMode;
        final boolean z11 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment alignment2 = (i3 & 512) != 0 ? Alignment.Companion.e : alignment;
        ContentScale contentScale2 = (i3 & 1024) != 0 ? ContentScale.Companion.b : contentScale;
        final boolean z12 = (i3 & 2048) != 0 ? true : z5;
        final boolean z13 = (i3 & 4096) != 0 ? false : z6;
        final Map map2 = (i3 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 16384) != 0 ? AsyncUpdates.d : asyncUpdates;
        boolean z14 = (i3 & 32768) != 0 ? false : z7;
        composerImplV.F(185152144);
        Object objG = composerImplV.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new LottieDrawable();
            composerImplV.A(objG);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) objG;
        composerImplV.V(false);
        composerImplV.F(185152191);
        Object objG2 = composerImplV.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new Matrix();
            composerImplV.A(objG2);
        }
        final Matrix matrix = (Matrix) objG2;
        composerImplV.V(false);
        composerImplV.F(185152271);
        boolean zN = composerImplV.n(lottieComposition);
        Object objG3 = composerImplV.G();
        if (zN || objG3 == composer$Companion$Empty$1) {
            objG3 = SnapshotStateKt.f(null);
            composerImplV.A(objG3);
        }
        final MutableState mutableState = (MutableState) objG3;
        composerImplV.V(false);
        composerImplV.F(185152323);
        if (lottieComposition == null || lottieComposition.b() == BitmapDescriptorFactory.HUE_RED) {
            final boolean z15 = z10;
            final RenderMode renderMode3 = renderMode2;
            final ContentScale contentScale3 = contentScale2;
            final boolean z16 = z11;
            final boolean z17 = z14;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final Alignment alignment3 = alignment2;
            final boolean z18 = z8;
            final boolean z19 = z13;
            BoxKt.a(modifier, composerImplV, (i >> 6) & 14);
            composerImplV.V(false);
            RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
            if (recomposeScopeImplX != null) {
                final boolean z20 = z12;
                recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        int iA = RecomposeScopeImplKt.a(i | 1);
                        int iA2 = RecomposeScopeImplKt.a(i2);
                        int i4 = i3;
                        LottieAnimationKt.b(lottieComposition, progress, modifier, z18, z9, z15, renderMode3, z16, lottieDynamicProperties3, alignment3, contentScale3, z20, z19, map2, asyncUpdates3, z17, (Composer) obj, iA, iA2, i4);
                        return Unit.f24250a;
                    }
                };
                return;
            }
            return;
        }
        composerImplV.V(false);
        final ContentScale contentScale4 = contentScale2;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final Rect rect = lottieComposition.k;
        final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Intrinsics.h(modifier, "<this>");
        Modifier modifierX0 = modifier.x0(new LottieAnimationSizeElement(iWidth, iHeight));
        final Alignment alignment4 = alignment2;
        final Map map3 = map2;
        final boolean z21 = z9;
        final boolean z22 = z10;
        final boolean z23 = z14;
        Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                Canvas canvasA = Canvas.getE().a();
                Rect rect2 = rect;
                long jA = SizeKt.a(rect2.width(), rect2.height());
                long jA2 = IntSizeKt.a(MathKt.b(Size.d(Canvas.h())), MathKt.b(Size.b(Canvas.h())));
                long jA3 = contentScale4.a(jA, Canvas.h());
                float fD = Size.d(jA);
                int i4 = ScaleFactor.f1894a;
                int i5 = (int) (jA3 >> 32);
                int i6 = (int) (jA3 & 4294967295L);
                long jA4 = alignment4.a(IntSizeKt.a((int) (Float.intBitsToFloat(i5) * fD), (int) (Float.intBitsToFloat(i6) * Size.b(jA))), jA2, Canvas.getLayoutDirection());
                Matrix matrix2 = matrix;
                matrix2.reset();
                matrix2.preTranslate((int) (jA4 >> 32), (int) (jA4 & 4294967295L));
                matrix2.preScale(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6));
                LottieDrawable lottieDrawable2 = lottieDrawable;
                lottieDrawable2.h(z22);
                lottieDrawable2.h = z23;
                lottieDrawable2.B = renderMode2;
                lottieDrawable2.e();
                lottieDrawable2.Q = asyncUpdates4;
                lottieDrawable2.q(lottieComposition);
                Map map4 = lottieDrawable2.o;
                Map map5 = map3;
                if (map5 != map4) {
                    lottieDrawable2.o = map5;
                    lottieDrawable2.invalidateSelf();
                }
                MutableState mutableState2 = mutableState;
                LottieDynamicProperties lottieDynamicProperties5 = (LottieDynamicProperties) mutableState2.getD();
                Marker markerD = null;
                LottieDynamicProperties lottieDynamicProperties6 = lottieDynamicProperties4;
                if (lottieDynamicProperties6 != lottieDynamicProperties5) {
                    LottieDynamicProperties lottieDynamicProperties7 = (LottieDynamicProperties) mutableState2.getD();
                    if (lottieDynamicProperties7 != null) {
                        Iterator it = lottieDynamicProperties7.f13380a.iterator();
                        while (it.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty = (LottieDynamicProperty) it.next();
                            lottieDrawable2.a(lottieDynamicProperty.b, lottieDynamicProperty.f13381a, null);
                        }
                        Iterator it2 = lottieDynamicProperties7.b.iterator();
                        while (it2.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty2 = (LottieDynamicProperty) it2.next();
                            lottieDrawable2.a(lottieDynamicProperty2.b, lottieDynamicProperty2.f13381a, null);
                        }
                        Iterator it3 = lottieDynamicProperties7.c.iterator();
                        while (it3.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty3 = (LottieDynamicProperty) it3.next();
                            lottieDrawable2.a(lottieDynamicProperty3.b, lottieDynamicProperty3.f13381a, null);
                        }
                        Iterator it4 = lottieDynamicProperties7.d.iterator();
                        while (it4.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty4 = (LottieDynamicProperty) it4.next();
                            lottieDrawable2.a(lottieDynamicProperty4.b, lottieDynamicProperty4.f13381a, null);
                        }
                        Iterator it5 = lottieDynamicProperties7.e.iterator();
                        while (it5.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty5 = (LottieDynamicProperty) it5.next();
                            lottieDrawable2.a(lottieDynamicProperty5.b, lottieDynamicProperty5.f13381a, null);
                        }
                        Iterator it6 = lottieDynamicProperties7.f.iterator();
                        while (it6.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty6 = (LottieDynamicProperty) it6.next();
                            lottieDrawable2.a(lottieDynamicProperty6.b, lottieDynamicProperty6.f13381a, null);
                        }
                        Iterator it7 = lottieDynamicProperties7.g.iterator();
                        while (it7.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty7 = (LottieDynamicProperty) it7.next();
                            lottieDrawable2.a(lottieDynamicProperty7.b, lottieDynamicProperty7.f13381a, null);
                        }
                        Iterator it8 = lottieDynamicProperties7.h.iterator();
                        while (it8.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty8 = (LottieDynamicProperty) it8.next();
                            lottieDrawable2.a(lottieDynamicProperty8.b, lottieDynamicProperty8.f13381a, null);
                        }
                        Iterator it9 = lottieDynamicProperties7.i.iterator();
                        while (it9.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty9 = (LottieDynamicProperty) it9.next();
                            lottieDrawable2.a(lottieDynamicProperty9.b, lottieDynamicProperty9.f13381a, null);
                        }
                        Iterator it10 = lottieDynamicProperties7.j.iterator();
                        while (it10.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty10 = (LottieDynamicProperty) it10.next();
                            lottieDrawable2.a(lottieDynamicProperty10.b, lottieDynamicProperty10.f13381a, null);
                        }
                    }
                    if (lottieDynamicProperties6 != null) {
                        Iterator it11 = lottieDynamicProperties6.f13380a.iterator();
                        while (it11.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty11 = (LottieDynamicProperty) it11.next();
                            KeyPath keyPath = lottieDynamicProperty11.b;
                            Object obj2 = lottieDynamicProperty11.f13381a;
                            final Function1 function12 = lottieDynamicProperty11.c;
                            lottieDrawable2.a(keyPath, obj2, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function12).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it12 = lottieDynamicProperties6.b.iterator();
                        while (it12.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty12 = (LottieDynamicProperty) it12.next();
                            KeyPath keyPath2 = lottieDynamicProperty12.b;
                            Object obj3 = lottieDynamicProperty12.f13381a;
                            final Function1 function13 = lottieDynamicProperty12.c;
                            lottieDrawable2.a(keyPath2, obj3, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function13).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it13 = lottieDynamicProperties6.c.iterator();
                        while (it13.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty13 = (LottieDynamicProperty) it13.next();
                            KeyPath keyPath3 = lottieDynamicProperty13.b;
                            Object obj4 = lottieDynamicProperty13.f13381a;
                            final Function1 function14 = lottieDynamicProperty13.c;
                            lottieDrawable2.a(keyPath3, obj4, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function14).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it14 = lottieDynamicProperties6.d.iterator();
                        while (it14.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty14 = (LottieDynamicProperty) it14.next();
                            KeyPath keyPath4 = lottieDynamicProperty14.b;
                            Object obj5 = lottieDynamicProperty14.f13381a;
                            final Function1 function15 = lottieDynamicProperty14.c;
                            lottieDrawable2.a(keyPath4, obj5, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function15).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it15 = lottieDynamicProperties6.e.iterator();
                        while (it15.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty15 = (LottieDynamicProperty) it15.next();
                            KeyPath keyPath5 = lottieDynamicProperty15.b;
                            Object obj6 = lottieDynamicProperty15.f13381a;
                            final Function1 function16 = lottieDynamicProperty15.c;
                            lottieDrawable2.a(keyPath5, obj6, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function16).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it16 = lottieDynamicProperties6.f.iterator();
                        while (it16.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty16 = (LottieDynamicProperty) it16.next();
                            KeyPath keyPath6 = lottieDynamicProperty16.b;
                            Object obj7 = lottieDynamicProperty16.f13381a;
                            final Function1 function17 = lottieDynamicProperty16.c;
                            lottieDrawable2.a(keyPath6, obj7, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function17).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it17 = lottieDynamicProperties6.g.iterator();
                        while (it17.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty17 = (LottieDynamicProperty) it17.next();
                            KeyPath keyPath7 = lottieDynamicProperty17.b;
                            Object obj8 = lottieDynamicProperty17.f13381a;
                            final Function1 function18 = lottieDynamicProperty17.c;
                            lottieDrawable2.a(keyPath7, obj8, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function18).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it18 = lottieDynamicProperties6.h.iterator();
                        while (it18.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty18 = (LottieDynamicProperty) it18.next();
                            KeyPath keyPath8 = lottieDynamicProperty18.b;
                            Object obj9 = lottieDynamicProperty18.f13381a;
                            final Function1 function19 = lottieDynamicProperty18.c;
                            lottieDrawable2.a(keyPath8, obj9, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function19).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it19 = lottieDynamicProperties6.i.iterator();
                        while (it19.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty19 = (LottieDynamicProperty) it19.next();
                            KeyPath keyPath9 = lottieDynamicProperty19.b;
                            Object obj10 = lottieDynamicProperty19.f13381a;
                            final Function1 function110 = lottieDynamicProperty19.c;
                            lottieDrawable2.a(keyPath9, obj10, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function110).invoke(lottieFrameInfo);
                                }
                            });
                        }
                        Iterator it20 = lottieDynamicProperties6.j.iterator();
                        while (it20.hasNext()) {
                            LottieDynamicProperty lottieDynamicProperty20 = (LottieDynamicProperty) it20.next();
                            KeyPath keyPath10 = lottieDynamicProperty20.b;
                            Object obj11 = lottieDynamicProperty20.f13381a;
                            final Function1 function111 = lottieDynamicProperty20.c;
                            lottieDrawable2.a(keyPath10, obj11, new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
                                @Override // com.airbnb.lottie.value.LottieValueCallback
                                public final Object a(LottieFrameInfo lottieFrameInfo) {
                                    return ((LottieDynamicProperty.AnonymousClass1) function111).invoke(lottieFrameInfo);
                                }
                            });
                        }
                    }
                    mutableState2.setValue(lottieDynamicProperties6);
                }
                boolean z24 = lottieDrawable2.y;
                boolean z25 = z8;
                if (z24 != z25) {
                    lottieDrawable2.y = z25;
                    CompositionLayer compositionLayer = lottieDrawable2.v;
                    if (compositionLayer != null) {
                        compositionLayer.q(z25);
                    }
                }
                lottieDrawable2.z = z21;
                lottieDrawable2.t = z11;
                boolean z26 = lottieDrawable2.u;
                boolean z27 = z12;
                if (z27 != z26) {
                    lottieDrawable2.u = z27;
                    CompositionLayer compositionLayer2 = lottieDrawable2.v;
                    if (compositionLayer2 != null) {
                        compositionLayer2.J = z27;
                    }
                    lottieDrawable2.invalidateSelf();
                }
                boolean z28 = lottieDrawable2.A;
                boolean z29 = z13;
                if (z29 != z28) {
                    lottieDrawable2.A = z29;
                    lottieDrawable2.invalidateSelf();
                }
                Iterator it21 = LottieDrawable.U.iterator();
                while (it21.hasNext()) {
                    markerD = lottieDrawable2.d.d((String) it21.next());
                    if (markerD != null) {
                        break;
                    }
                }
                if (lottieDrawable2.b(context) || markerD == null) {
                    lottieDrawable2.x(((Number) progress.invoke()).floatValue());
                } else {
                    lottieDrawable2.x(markerD.b);
                }
                lottieDrawable2.setBounds(0, 0, rect2.width(), rect2.height());
                android.graphics.Canvas canvasA2 = AndroidCanvas_androidKt.a(canvasA);
                g gVar = lottieDrawable2.S;
                ThreadPoolExecutor threadPoolExecutor = LottieDrawable.V;
                LottieValueAnimator lottieValueAnimator = lottieDrawable2.e;
                Semaphore semaphore = lottieDrawable2.R;
                CompositionLayer compositionLayer3 = lottieDrawable2.v;
                LottieComposition lottieComposition2 = lottieDrawable2.d;
                if (compositionLayer3 != null && lottieComposition2 != null) {
                    AsyncUpdates asyncUpdates5 = lottieDrawable2.Q;
                    if (asyncUpdates5 == null) {
                        asyncUpdates5 = AsyncUpdates.d;
                    }
                    boolean z30 = asyncUpdates5 == AsyncUpdates.e;
                    if (z30) {
                        try {
                            semaphore.acquire();
                            if (lottieDrawable2.y()) {
                                lottieDrawable2.x(lottieValueAnimator.c());
                            }
                        } catch (InterruptedException unused) {
                            if (z30) {
                                semaphore.release();
                                if (compositionLayer3.I != lottieValueAnimator.c()) {
                                }
                            }
                        } catch (Throwable th) {
                            if (z30) {
                                semaphore.release();
                                if (compositionLayer3.I != lottieValueAnimator.c()) {
                                    threadPoolExecutor.execute(gVar);
                                }
                            }
                            throw th;
                        }
                    }
                    if (lottieDrawable2.C) {
                        canvasA2.save();
                        canvasA2.concat(matrix2);
                        lottieDrawable2.o(canvasA2, compositionLayer3);
                        canvasA2.restore();
                    } else {
                        compositionLayer3.d(canvasA2, matrix2, lottieDrawable2.w);
                    }
                    lottieDrawable2.P = false;
                    if (z30) {
                        semaphore.release();
                        if (compositionLayer3.I != lottieValueAnimator.c()) {
                            threadPoolExecutor.execute(gVar);
                        }
                    }
                }
                return Unit.f24250a;
            }
        };
        final RenderMode renderMode4 = renderMode2;
        final boolean z24 = z8;
        final boolean z25 = z11;
        final boolean z26 = z13;
        CanvasKt.a(modifierX0, function1, composerImplV, 0);
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final boolean z27 = z12;
            recomposeScopeImplX2.d = new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int i4 = i3;
                    LottieAnimationKt.b(lottieComposition, progress, modifier, z24, z21, z22, renderMode4, z25, lottieDynamicProperties4, alignment4, contentScale4, z27, z26, map3, asyncUpdates4, z23, (Composer) obj, iA, iA2, i4);
                    return Unit.f24250a;
                }
            };
        }
    }
}

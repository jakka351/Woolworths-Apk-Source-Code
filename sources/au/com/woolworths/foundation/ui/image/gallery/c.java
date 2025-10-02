package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSizeKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.marketplace.ui.categories.d;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ c(PointerInputScope pointerInputScope, CoroutineScope coroutineScope, MutableState mutableState, MutableFloatState mutableFloatState, TransformableState transformableState, MutableState mutableState2) {
        this.f = pointerInputScope;
        this.e = coroutineScope;
        this.g = mutableState;
        this.i = mutableFloatState;
        this.j = transformableState;
        this.h = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                PointerInputScope pointerInputScope = (PointerInputScope) this.f;
                MutableState mutableState = (MutableState) this.g;
                MutableFloatState mutableFloatState = (MutableFloatState) this.i;
                TransformableState transformableState = (TransformableState) this.j;
                MutableState mutableState2 = (MutableState) this.h;
                Offset offset = (Offset) obj;
                float f = ((Boolean) mutableState.getD()).booleanValue() ? 1.0f : 4.0f;
                BuildersKt.c(this.e, null, null, new GalleryImagesCarouselKt$GalleryImagesCarousel$2$1$6$1$1$1$1(transformableState, f, ((Boolean) mutableState.getD()).booleanValue() ? 0L : Offset.i(Offset.b(Offset.g(SizeKt.b(IntSizeKt.d(pointerInputScope.getC())), offset.f1751a), mutableFloatState.a()), f), mutableFloatState, mutableState2, mutableState, null), 3);
                break;
            default:
                final List list = (List) this.f;
                final PagerState pagerState = (PagerState) this.g;
                final LazyListState lazyListState = (LazyListState) this.h;
                final Function1 function1 = (Function1) this.i;
                final ColorPainter colorPainter = (ColorPainter) this.j;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final d dVar = new d(list, 3);
                int size = list.size();
                Function1<Integer, Object> function12 = new Function1<Integer, Object>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$lambda$8$lambda$7$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return dVar.invoke(list.get(((Number) obj2).intValue()));
                    }
                };
                Function1<Integer, Object> function13 = new Function1<Integer, Object>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$lambda$8$lambda$7$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final CoroutineScope coroutineScope = this.e;
                LazyRow.b(size, function12, function13, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$lambda$8$lambda$7$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        long j;
                        final ImageCarouselItem imageCarouselItem;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            ImageCarouselItem imageCarouselItem2 = (ImageCarouselItem) list.get(iIntValue);
                            composer.o(505372747);
                            PagerState pagerState2 = pagerState;
                            int iJ = pagerState2.j();
                            List list2 = list;
                            if (Intrinsics.c(list2.get(iJ), imageCarouselItem2)) {
                                composer.o(505327920);
                                j = CoreTheme.b(composer).f4782a.b.f4789a.b;
                                composer.l();
                            } else {
                                composer.o(505413046);
                                j = CoreTheme.b(composer).e.b.f4852a;
                                composer.l();
                            }
                            float f2 = Intrinsics.c(list2.get(pagerState2.j()), imageCarouselItem2) ? 2 : 1;
                            float f3 = list2.indexOf(imageCarouselItem2) == 0 ? 16 : 0;
                            float f4 = list2.indexOf(imageCarouselItem2) == list2.size() - 1 ? 16 : 0;
                            Modifier.Companion companion = Modifier.Companion.d;
                            float f5 = 8;
                            Modifier modifierQ = androidx.compose.foundation.layout.SizeKt.q(BorderKt.a(ClipKt.a(PaddingKt.j(companion, f3, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, 10), RoundedCornerShapeKt.b(f5)), f2, j, RoundedCornerShapeKt.b(f5)), 48);
                            composer.o(-1224400529);
                            boolean zN = composer.n(pagerState2) | composer.I(coroutineScope) | composer.I(list2) | composer.I(imageCarouselItem2) | composer.n(lazyListState) | composer.n(function1);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                final PagerState pagerState3 = pagerState;
                                final LazyListState lazyListState2 = lazyListState;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final Function1 function14 = function1;
                                final List list3 = list;
                                imageCarouselItem = imageCarouselItem2;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$1$1$2$1$1

                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                    @DebugMetadata(c = "au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$1$1$2$1$1$1", f = "GalleryImagesCarousel.kt", l = {294, 302, 312}, m = "invokeSuspend")
                                    /* renamed from: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$1$1$2$1$1$1, reason: invalid class name */
                                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public int p;
                                        public int q;
                                        public final /* synthetic */ PagerState r;
                                        public final /* synthetic */ List s;
                                        public final /* synthetic */ ImageCarouselItem t;
                                        public final /* synthetic */ LazyListState u;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(PagerState pagerState, List list, ImageCarouselItem imageCarouselItem, LazyListState lazyListState, Continuation continuation) {
                                            super(2, continuation);
                                            this.r = pagerState;
                                            this.s = list;
                                            this.t = imageCarouselItem;
                                            this.u = lazyListState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation create(Object obj, Continuation continuation) {
                                            return new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
                                        
                                            if (androidx.compose.foundation.lazy.LazyListState.f(r4, r10, r9) == r0) goto L27;
                                         */
                                        /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                        */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                                            /*
                                                r9 = this;
                                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                                int r1 = r9.q
                                                r2 = 3
                                                r3 = 2
                                                androidx.compose.foundation.lazy.LazyListState r4 = r9.u
                                                au.com.woolworths.foundation.ui.image.gallery.ImageCarouselItem r5 = r9.t
                                                java.util.List r6 = r9.s
                                                r7 = 1
                                                if (r1 == 0) goto L2d
                                                if (r1 == r7) goto L29
                                                if (r1 == r3) goto L22
                                                if (r1 != r2) goto L1a
                                                kotlin.ResultKt.b(r10)
                                                goto Lc9
                                            L1a:
                                                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                r10.<init>(r0)
                                                throw r10
                                            L22:
                                                int r1 = r9.p
                                                kotlin.ResultKt.b(r10)
                                                goto La0
                                            L29:
                                                kotlin.ResultKt.b(r10)
                                                goto L40
                                            L2d:
                                                kotlin.ResultKt.b(r10)
                                                int r10 = r6.indexOf(r5)
                                                r9.q = r7
                                                androidx.compose.foundation.pager.PagerState r1 = r9.r
                                                java.lang.Object r10 = androidx.compose.foundation.pager.PagerState.t(r1, r10, r9)
                                                if (r10 != r0) goto L40
                                                goto Lc8
                                            L40:
                                                androidx.compose.foundation.lazy.LazyListLayoutInfo r10 = r4.j()
                                                java.util.List r10 = r10.f()
                                                java.lang.Object r10 = kotlin.collections.CollectionsKt.O(r10)
                                                androidx.compose.foundation.lazy.LazyListItemInfo r10 = (androidx.compose.foundation.lazy.LazyListItemInfo) r10
                                                java.lang.Object r10 = r10.getL()
                                                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
                                                kotlin.jvm.internal.Intrinsics.f(r10, r1)
                                                java.lang.Integer r10 = (java.lang.Integer) r10
                                                int r10 = r10.intValue()
                                                androidx.compose.foundation.lazy.LazyListLayoutInfo r8 = r4.j()
                                                java.util.List r8 = r8.f()
                                                java.lang.Object r8 = kotlin.collections.CollectionsKt.D(r8)
                                                androidx.compose.foundation.lazy.LazyListItemInfo r8 = (androidx.compose.foundation.lazy.LazyListItemInfo) r8
                                                java.lang.Object r8 = r8.getL()
                                                kotlin.jvm.internal.Intrinsics.f(r8, r1)
                                                java.lang.Integer r8 = (java.lang.Integer) r8
                                                int r1 = r8.intValue()
                                                int r10 = r10 - r7
                                                java.lang.Object r10 = r6.get(r10)
                                                boolean r10 = kotlin.jvm.internal.Intrinsics.c(r5, r10)
                                                if (r10 == 0) goto La0
                                                int r10 = r6.indexOf(r5)
                                                androidx.compose.foundation.lazy.LazyListLayoutInfo r8 = r4.j()
                                                java.util.List r8 = r8.f()
                                                int r8 = r8.size()
                                                int r8 = r8 + r10
                                                int r8 = r8 - r7
                                                r9.p = r1
                                                r9.q = r3
                                                java.lang.Object r10 = androidx.compose.foundation.lazy.LazyListState.f(r4, r8, r9)
                                                if (r10 != r0) goto La0
                                                goto Lc8
                                            La0:
                                                int r1 = r1 + r7
                                                java.lang.Object r10 = r6.get(r1)
                                                boolean r10 = kotlin.jvm.internal.Intrinsics.c(r5, r10)
                                                if (r10 == 0) goto Lc9
                                                int r10 = r6.indexOf(r5)
                                                androidx.compose.foundation.lazy.LazyListLayoutInfo r1 = r4.j()
                                                java.util.List r1 = r1.f()
                                                int r1 = r1.size()
                                                int r10 = r10 - r1
                                                int r10 = r10 + r7
                                                if (r10 >= 0) goto Lc0
                                                r10 = 0
                                            Lc0:
                                                r9.q = r2
                                                java.lang.Object r10 = androidx.compose.foundation.lazy.LazyListState.f(r4, r10, r9)
                                                if (r10 != r0) goto Lc9
                                            Lc8:
                                                return r0
                                            Lc9:
                                                kotlin.Unit r10 = kotlin.Unit.f24250a
                                                return r10
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$1$1$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        BuildersKt.c(coroutineScope2, null, null, new AnonymousClass1(pagerState3, list3, imageCarouselItem, lazyListState2, null), 3);
                                        function14.invoke(Integer.valueOf(list3.indexOf(imageCarouselItem)));
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(function0);
                                objG = function0;
                            } else {
                                imageCarouselItem = imageCarouselItem2;
                            }
                            composer.l();
                            Modifier modifierX0 = modifierQ.x0(ClickableKt.d(companion, false, null, null, (Function0) objG, 7));
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                            int p = composer.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                            Modifier modifierD = ComposedModifierKt.d(composer, modifierX0);
                            ComposeUiNode.e3.getClass();
                            Function0 function02 = ComposeUiNode.Companion.b;
                            if (composer.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer.i();
                            if (composer.getO()) {
                                composer.K(function02);
                            } else {
                                composer.e();
                            }
                            Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
                            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer, p, function2);
                            }
                            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                            Modifier modifierA = ClipKt.a(androidx.compose.foundation.layout.SizeKt.q(companion, 40), RoundedCornerShapeKt.b(4));
                            String f12615a = imageCarouselItem.getF12615a();
                            String b = imageCarouselItem.getB();
                            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$GalleryImagesCarouselKt.f8925a;
                            final ColorPainter colorPainter2 = colorPainter;
                            SingletonSubcomposeAsyncImageKt.b(f12615a, b, modifierA, composableLambdaImpl, ComposableLambdaKt.c(-1323570715, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.ui.image.gallery.GalleryImagesCarouselKt$Thumbnails$1$1$2$2$1
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj6;
                                    AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj7;
                                    Composer composer2 = (Composer) obj8;
                                    int iIntValue3 = ((Number) obj9).intValue();
                                    Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.h(it, "it");
                                    if ((iIntValue3 & 129) == 128 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ImageKt.a(colorPainter2, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), null, ContentScale.Companion.f1880a, composer, 1597440, 48, 63400);
                            composer.f();
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(List list, PagerState pagerState, CoroutineScope coroutineScope, LazyListState lazyListState, Function1 function1, ColorPainter colorPainter) {
        this.f = list;
        this.g = pagerState;
        this.e = coroutineScope;
        this.h = lazyListState;
        this.i = function1;
        this.j = colorPainter;
    }
}

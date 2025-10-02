package au.com.woolworths.foundation.rewards.common.ui.iconlist;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ActionItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.ItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.internal.TopRowContainerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsIconListUiKt {
    public static final void a(final RewardsIconListModel.Item item, final Function1 function1, Modifier modifier, float f, final Function2 function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        float f3;
        Modifier modifier3;
        final Modifier modifier4;
        final float f4;
        ComposerImpl composerImplV = composer.v(-1793339538);
        int i5 = i | (composerImplV.n(item) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3072;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (composerImplV.q(f2) ? 2048 : 1024);
        }
        int i8 = i4 | (composerImplV.I(function2) ? 16384 : 8192);
        if ((i8 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier4 = modifier2;
            f4 = f2;
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.Companion.d;
            }
            Modifier modifier5 = modifier2;
            float f5 = i7 != 0 ? 0 : f2;
            if (item instanceof RewardsIconListModel.Item.Action) {
                composerImplV.o(-279643278);
                ActionItemUiKt.a((RewardsIconListModel.Item.Action) item, function1, PaddingKt.j(modifier5, BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, i8 & 112);
                composerImplV.V(false);
                f3 = f5;
                modifier3 = modifier5;
            } else if (item instanceof RewardsIconListModel.Item.MarkdownContent) {
                composerImplV.o(-279386908);
                Modifier modifierJ = PaddingKt.j(modifier5, BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                f3 = f5;
                modifier3 = modifier5;
                Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
                Intrinsics.h(context, "context");
                ItemUiKt.a(function1, function2, modifierJ, null, null, "Share your unique link", null, RewardsIconListModelKt.a(context, "Share your unique link"), ((RewardsIconListModel.Item.MarkdownContent) item).f8588a, composerImplV, ((i8 >> 3) & 14) | ((i8 >> 9) & 112), 88);
                composerImplV.V(false);
            } else {
                float f6 = f5;
                if (!(item instanceof RewardsIconListModel.Item.Ordered)) {
                    throw au.com.woolworths.android.onesite.a.w(-1117400194, composerImplV, false);
                }
                composerImplV.o(-278934587);
                Modifier modifierJ2 = PaddingKt.j(modifier5, BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                f3 = f6;
                modifier3 = modifier5;
                RewardsIconListModel.Item.Ordered ordered = (RewardsIconListModel.Item.Ordered) item;
                String str = ordered.f8589a;
                String str2 = ordered.b;
                String str3 = ordered.c;
                String strO = Boolean.FALSE.equals(Boolean.TRUE) ? str2 == null ? "" : str2 : b.o(str, ", ", str2);
                Context context2 = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
                Intrinsics.h(context2, "context");
                String str4 = ordered.c;
                ItemUiKt.a(function1, function2, modifierJ2, str, str2, str3, strO, str4 != null ? RewardsIconListModelKt.a(context2, str4) : null, ordered.d, composerImplV, ((i8 >> 3) & 14) | ((i8 >> 9) & 112), 0);
                composerImplV.V(false);
            }
            modifier4 = modifier3;
            f4 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(function1, modifier4, f4, function2, i, i2) { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.a
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Modifier f;
                public final /* synthetic */ float g;
                public final /* synthetic */ Function2 h;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    RewardsIconListUiKt.a(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA, this.i);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(LazyListScope lazyListScope, final RewardsIconListModel.Content iconListContent, final PaddingValuesImpl paddingValuesImpl, final Function1 function1, final Function2 function2) {
        Intrinsics.h(lazyListScope, "<this>");
        Intrinsics.h(iconListContent, "iconListContent");
        final List list = iconListContent.b;
        float f = 0;
        if (Float.compare(paddingValuesImpl.b, f) > 0) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        SpacerKt.a(composer, SizeKt.g(Modifier.Companion.d, paddingValuesImpl.b));
                    }
                    return Unit.f24250a;
                }
            }, true, 2064627945), 3);
        }
        if (list.isEmpty()) {
            final String str = iconListContent.f8586a;
            if (str != null) {
                LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$3$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope item = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.n;
                            LayoutDirection layoutDirection = (LayoutDirection) composer.x(staticProvidableCompositionLocal);
                            PaddingValuesImpl paddingValuesImpl2 = paddingValuesImpl;
                            TopRowContainerKt.a(str, PaddingKt.j(Modifier.Companion.d, PaddingKt.d(paddingValuesImpl2, layoutDirection), BitmapDescriptorFactory.HUE_RED, PaddingKt.c(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal)), BitmapDescriptorFactory.HUE_RED, 10), ComposableSingletons$RewardsIconListUiKt.f8585a, composer, KyberEngine.KyberPolyBytes);
                        }
                        return Unit.f24250a;
                    }
                }, true, -1848314231), 3);
            }
        } else {
            lazyListScope.b(list.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    list.get(((Number) obj).intValue());
                    return null;
                }
            }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    Modifier modifierJ;
                    LazyItemScope lazyItemScope = (LazyItemScope) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    Composer composer = (Composer) obj3;
                    int iIntValue2 = ((Number) obj4).intValue();
                    if ((iIntValue2 & 6) == 0) {
                        i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 48) == 0) {
                        i |= composer.r(iIntValue) ? 32 : 16;
                    }
                    if (composer.z(i & 1, (i & 147) != 146)) {
                        final RewardsIconListModel.Item item = (RewardsIconListModel.Item) list.get(iIntValue);
                        composer.o(-1956312956);
                        final Function2 function22 = function2;
                        final Function1 function12 = function1;
                        Modifier.Companion companion = Modifier.Companion.d;
                        RewardsIconListModel.Content content = iconListContent;
                        PaddingValuesImpl paddingValuesImpl2 = paddingValuesImpl;
                        if (iIntValue != 0 || content.f8586a == null) {
                            composer.o(-1955624881);
                            float f2 = iIntValue == 0 ? 0 : (iIntValue > 0 && (content.b.get(iIntValue) instanceof RewardsIconListModel.Item.Ordered) && (content.b.get(iIntValue - 1) instanceof RewardsIconListModel.Item.Ordered)) ? 16 : 8;
                            if (content.f8586a != null) {
                                composer.o(-1955103089);
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.n;
                                modifierJ = PaddingKt.j(companion, PaddingKt.c(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal)) + 56, BitmapDescriptorFactory.HUE_RED, PaddingKt.c(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal)), BitmapDescriptorFactory.HUE_RED, 10);
                                composer.l();
                            } else {
                                composer.o(-1954703592);
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.n;
                                modifierJ = PaddingKt.j(companion, PaddingKt.d(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal2)), BitmapDescriptorFactory.HUE_RED, PaddingKt.c(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal2)), BitmapDescriptorFactory.HUE_RED, 10);
                                composer.l();
                            }
                            RewardsIconListUiKt.a(item, function12, modifierJ, f2, function22, composer, 0, 0);
                            composer.l();
                        } else {
                            composer.o(-1956310260);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CompositionLocalsKt.n;
                            TopRowContainerKt.a(content.f8586a, PaddingKt.j(companion, PaddingKt.d(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal3)), BitmapDescriptorFactory.HUE_RED, PaddingKt.c(paddingValuesImpl2, (LayoutDirection) composer.x(staticProvidableCompositionLocal3)), BitmapDescriptorFactory.HUE_RED, 10), ComposableLambdaKt.c(-2023625776, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    BoxScope TopRowContainer = (BoxScope) obj5;
                                    Composer composer2 = (Composer) obj6;
                                    int iIntValue3 = ((Number) obj7).intValue();
                                    Intrinsics.h(TopRowContainer, "$this$TopRowContainer");
                                    if ((iIntValue3 & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        RewardsIconListUiKt.a(item, function12, null, BitmapDescriptorFactory.HUE_RED, function22, composer2, 0, 12);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, KyberEngine.KyberPolyBytes);
                            composer.l();
                        }
                        composer.l();
                    } else {
                        composer.j();
                    }
                    return Unit.f24250a;
                }
            }, true, -1091073711));
        }
        if (Float.compare(paddingValuesImpl.d, f) > 0) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt$rewardsIconListUi$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        SpacerKt.a(composer, SizeKt.g(Modifier.Companion.d, paddingValuesImpl.d));
                    }
                    return Unit.f24250a;
                }
            }, true, -1169068175), 3);
        }
    }
}

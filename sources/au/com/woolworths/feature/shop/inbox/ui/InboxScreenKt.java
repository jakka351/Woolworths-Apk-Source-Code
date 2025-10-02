package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DismissState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.e;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.dialog.AlertDialog;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.product.list.v2.ui.f;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.InboxViewModel;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSection;
import au.com.woolworths.feature.shop.inbox.ui.component.SwipeToDeleteKt;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "uiState", "", "hasTrackedBanner", "inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InboxScreenKt {
    public static final void a(final InboxUiState.Content content, final Function1 function1, final Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-569518582);
        int i2 = i | (composerImplV.n(content) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == obj) {
                objG2 = new au.com.woolworths.feature.shop.contentpage.ui.c(16, function1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ListItemsSeenEffectKt.a(ListItemsSeenEffectKt.e(lazyListStateA, 0.8f, (Function1) objG2, composerImplV, 48, 0), composerImplV, 0);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lazyListStateA);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new au.com.woolworths.design.wx.component.topbar.a(lazyListStateA, 4);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            composerImplV.g((Function0) objG3);
            Modifier modifierB = BackgroundKt.b(SizeKt.c, WxTheme.a(composerImplV).b(), RectangleShapeKt.f1779a);
            composerImplV.o(-1224400529);
            boolean z2 = ((i2 & 14) == 4) | (i3 == 32);
            Object objG4 = composerImplV.G();
            if (z2 || objG4 == obj) {
                objG4 = new Function1() { // from class: au.com.woolworths.feature.shop.inbox.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope LazyColumn = (LazyListScope) obj2;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final InboxUiState.Content content2 = content;
                        final LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem = content2.b;
                        final Function1 function12 = function1;
                        if (lastUnreadChatbotMessageItem != null) {
                            final MutableState mutableState2 = mutableState;
                            LazyListScope.i(LazyColumn, "last_chatbot_message", null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        Function1 function13 = function12;
                                        boolean zN2 = composer2.n(function13);
                                        Object objG5 = composer2.G();
                                        if (zN2 || objG5 == Composer.Companion.f1624a) {
                                            objG5 = new f(21, function13);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        InboxScreenKt.d(lastUnreadChatbotMessageItem, (Function0) objG5, composer2, 0);
                                        MutableState mutableState3 = mutableState2;
                                        if (!((Boolean) mutableState3.getD()).booleanValue()) {
                                            function13.invoke(InboxUiEvent.TrackMessageUsBannerView.f7278a);
                                            mutableState3.setValue(Boolean.TRUE);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -1131880938), 2);
                            LazyListScope.i(LazyColumn, "divider", null, ComposableSingletons$InboxScreenKt.f7295a, 2);
                            final Function0 function02 = function0;
                            LazyColumn.c("notification_header", "notification_header", new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$1$2
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                    LazyItemScope stickyHeader = (LazyItemScope) obj3;
                                    ((Number) obj4).intValue();
                                    Composer composer2 = (Composer) obj5;
                                    int iIntValue = ((Number) obj6).intValue();
                                    Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                    if ((iIntValue & 129) == 128 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(-1633490746);
                                        Function0 function03 = function02;
                                        boolean zN2 = composer2.n(function03);
                                        Function1 function13 = function12;
                                        boolean zN3 = zN2 | composer2.n(function13);
                                        Object objG5 = composer2.G();
                                        if (zN3 || objG5 == Composer.Companion.f1624a) {
                                            objG5 = new b(function03, function13);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        NotificationsTitleHeaderKt.a(0, 3, composer2, null, (Function0) objG5, false);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -699053022));
                        }
                        for (Map.Entry entry : content2.f7281a.entrySet()) {
                            final NotificationSection notificationSection = (NotificationSection) entry.getKey();
                            final List list = (List) entry.getValue();
                            if (content2.b != null) {
                                LazyListScope.i(LazyColumn, notificationSection.getClass().getSimpleName(), null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            MessageSectionHeaderKt.a(notificationSection, null, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -443117857), 2);
                            } else {
                                LazyColumn.c(notificationSection.getClass().getSimpleName(), "NotificationSection", new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$2
                                    @Override // kotlin.jvm.functions.Function4
                                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        LazyItemScope stickyHeader = (LazyItemScope) obj3;
                                        ((Number) obj4).intValue();
                                        Composer composer2 = (Composer) obj5;
                                        int iIntValue = ((Number) obj6).intValue();
                                        Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                        if ((iIntValue & 129) == 128 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            MessageSectionHeaderKt.a(notificationSection, null, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -481942038));
                            }
                            final d dVar = new d(7);
                            final d dVar2 = new d(8);
                            LazyColumn.b(list.size(), new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$lambda$44$lambda$43$lambda$42$$inlined$items$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return dVar.invoke(list.get(((Number) obj3).intValue()));
                                }
                            }, new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$lambda$44$lambda$43$lambda$42$$inlined$items$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    dVar2.invoke(list.get(((Number) obj3).intValue()));
                                    return "NotificationItem";
                                }
                            }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$lambda$44$lambda$43$lambda$42$$inlined$items$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                    int i4;
                                    LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Composer composer2 = (Composer) obj5;
                                    int iIntValue2 = ((Number) obj6).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        i4 = (composer2.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                    } else {
                                        i4 = iIntValue2;
                                    }
                                    if ((iIntValue2 & 48) == 0) {
                                        i4 |= composer2.r(iIntValue) ? 32 : 16;
                                    }
                                    if (composer2.z(i4 & 1, (i4 & 147) != 146)) {
                                        final NotificationItem notificationItem = (NotificationItem) list.get(iIntValue);
                                        composer2.o(1658717041);
                                        DismissState dismissStateB = SwipeToDismissKt.b(0, 3, composer2);
                                        Object d = ((SnapshotMutableStateImpl) dismissStateB.c).getD();
                                        composer2.o(-1746271574);
                                        boolean zN2 = composer2.n(dismissStateB);
                                        final Function1 function13 = function12;
                                        boolean zN3 = zN2 | composer2.n(function13) | composer2.n(notificationItem);
                                        Object objG5 = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        if (zN3 || objG5 == composer$Companion$Empty$1) {
                                            objG5 = new InboxScreenKt$ContentUi$3$1$2$5$1$1(dismissStateB, function13, notificationItem, null);
                                            composer2.A(objG5);
                                        }
                                        composer2.l();
                                        EffectsKt.e(composer2, d, (Function2) objG5);
                                        final String strC = StringResources_androidKt.c(composer2, R.string.inbox_content_description_clear_notification);
                                        Modifier modifierA = lazyItemScope.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5));
                                        composer2.o(-1746271574);
                                        boolean zN4 = composer2.n(strC) | composer2.n(function13) | composer2.n(notificationItem);
                                        Object objG6 = composer2.G();
                                        if (zN4 || objG6 == composer$Companion$Empty$1) {
                                            objG6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$2$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj7) {
                                                    SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj7;
                                                    Intrinsics.h(semantics, "$this$semantics");
                                                    final Function1 function14 = function13;
                                                    final NotificationItem notificationItem2 = notificationItem;
                                                    SemanticsPropertiesKt.l(semantics, CollectionsKt.Q(new CustomAccessibilityAction(strC, new Function0<Boolean>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$2$1.1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function14.invoke(new InboxUiEvent.DeleteItem(notificationItem2.f7288a));
                                                            return Boolean.TRUE;
                                                        }
                                                    })));
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG6);
                                        }
                                        composer2.l();
                                        Modifier modifierB2 = SemanticsModifierKt.b(modifierA, false, (Function1) objG6);
                                        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$InboxScreenKt.b;
                                        final InboxUiState.Content content3 = content2;
                                        final List list2 = list;
                                        SwipeToDeleteKt.a(dismissStateB, composableLambdaImpl, modifierB2, 0L, 0L, ComposableLambdaKt.c(-1749739438, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                RowScope SwipeToDelete = (RowScope) obj7;
                                                Composer composer3 = (Composer) obj8;
                                                int iIntValue3 = ((Number) obj9).intValue();
                                                Intrinsics.h(SwipeToDelete, "$this$SwipeToDelete");
                                                if ((iIntValue3 & 17) == 16 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    long jA = WxTheme.a(composer3).a();
                                                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                                                    Modifier.Companion companion = Modifier.Companion.d;
                                                    Modifier modifierB3 = BackgroundKt.b(companion, jA, rectangleShapeKt$RectangleShape$1);
                                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                                    int p = composer3.getP();
                                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierB3);
                                                    ComposeUiNode.e3.getClass();
                                                    Function0 function03 = ComposeUiNode.Companion.b;
                                                    if (composer3.w() == null) {
                                                        ComposablesKt.b();
                                                        throw null;
                                                    }
                                                    composer3.i();
                                                    if (composer3.getO()) {
                                                        composer3.K(function03);
                                                    } else {
                                                        composer3.e();
                                                    }
                                                    Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                    Function2 function2 = ComposeUiNode.Companion.j;
                                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                                    }
                                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                                    boolean z3 = content3.b != null;
                                                    composer3.o(-1633490746);
                                                    final Function1 function14 = function13;
                                                    boolean zN5 = composer3.n(function14);
                                                    final NotificationItem notificationItem2 = notificationItem;
                                                    boolean zN6 = zN5 | composer3.n(notificationItem2);
                                                    Object objG7 = composer3.G();
                                                    Object obj10 = Composer.Companion.f1624a;
                                                    if (zN6 || objG7 == obj10) {
                                                        objG7 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$3$1$1$1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                function14.invoke(new InboxUiEvent.ClickMessageCta(notificationItem2.f7288a));
                                                                return Unit.f24250a;
                                                            }
                                                        };
                                                        composer3.A(objG7);
                                                    }
                                                    Function0 function04 = (Function0) objG7;
                                                    boolean zC = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.C(-1633490746, composer3, function14) | composer3.n(notificationItem2);
                                                    Object objG8 = composer3.G();
                                                    if (zC || objG8 == obj10) {
                                                        objG8 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$ContentUi$3$1$2$5$3$1$2$1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                function14.invoke(new InboxUiEvent.ClickTncsButton(notificationItem2.f7288a));
                                                                return Unit.f24250a;
                                                            }
                                                        };
                                                        composer3.A(objG8);
                                                    }
                                                    composer3.l();
                                                    MessageRowKt.a(notificationItem2, z3, function04, (Function0) objG8, null, composer3, 0);
                                                    composer3.o(-1237416311);
                                                    if (!Intrinsics.c(notificationItem2.f7288a.f8440a, ((NotificationItem) CollectionsKt.O(list2)).f7288a.f8440a)) {
                                                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composer3, PaddingKt.j(companion, 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                                                    }
                                                    composer3.l();
                                                    composer3.f();
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer2), composer2, 196656, 24);
                                        composer2.l();
                                    } else {
                                        composer2.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, -632812321));
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            composerImplV = composerImplV;
            LazyDslKt.b(modifierB, lazyListStateA, null, false, null, null, null, false, null, (Function1) objG4, composerImplV, 0, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(content, function1, function0, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem r29, kotlin.jvm.functions.Function1 r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt.b(au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(InboxViewModel viewModel, Function2 onOpenTermsAndConditions, final Function0 onNavigateUp, Function0 openAskOlive, final String str, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onOpenTermsAndConditions, "onOpenTermsAndConditions");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(openAskOlive, "openAskOlive");
        ComposerImpl composerImplV = composer.v(-157948770);
        int i2 = i | (composerImplV.n(viewModel) ? 4 : 2) | (composerImplV.I(onOpenTermsAndConditions) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | (composerImplV.I(openAskOlive) ? 2048 : 1024) | (composerImplV.n(str) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Flow flow = viewModel.l;
            composerImplV.o(-1746271574);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (z || objG == obj) {
                objG = new InboxScreenKt$InboxScreen$1$1(viewModel, onOpenTermsAndConditions, openAskOlive, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG);
            final MutableState mutableStateA = FlowExtKt.a(viewModel.n, composerImplV);
            final au.com.woolworths.feature.shop.inbox.c cVar = viewModel.p;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG2);
            }
            final MutableState mutableState = (MutableState) objG2;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj) {
                objD = new SnackbarHostState();
                composerImplV.A(objD);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objD;
            composerImplV.V(false);
            ScaffoldKt.a(SizeKt.c, null, ComposableLambdaKt.c(398461497, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1369437256, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final State state = mutableStateA;
                        final MutableState mutableState2 = mutableState;
                        final Function1 function1 = cVar;
                        TopNavBarKt.b(str, null, null, null, 0L, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, composableLambdaImplC, ComposableLambdaKt.c(-427045778, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                RowScope TopNavBar = (RowScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int iIntValue = ((Number) obj6).intValue();
                                Intrinsics.h(TopNavBar, "$this$TopNavBar");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    State state2 = state;
                                    InboxUiState inboxUiState = (InboxUiState) state2.getD();
                                    if ((inboxUiState instanceof InboxUiState.Content ? (InboxUiState.Content) inboxUiState : null) != null && (!r12.f7281a.isEmpty())) {
                                        InboxUiState inboxUiState2 = (InboxUiState) state2.getD();
                                        InboxUiState.Content content = inboxUiState2 instanceof InboxUiState.Content ? (InboxUiState.Content) inboxUiState2 : null;
                                        if (content != null && content.b == null) {
                                            String strC = StringResources_androidKt.c(composer3, R.string.inbox_action_clear_all);
                                            composer3.o(-1633490746);
                                            Function1 function12 = function1;
                                            boolean zN = composer3.n(function12);
                                            Object objG3 = composer3.G();
                                            if (zN || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new e(5, mutableState2, function12);
                                                composer3.A(objG3);
                                            }
                                            composer3.l();
                                            TertiaryButtonKt.a(strC, (Function0) objG3, null, false, false, null, null, composer3, 0, 124);
                                        }
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 805306368, 6, 510);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1675693594, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    SnackbarHostState it = (SnackbarHostState) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, null, composer2, 6, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(-1572420089, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    PaddingValues it = (PaddingValues) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        InboxUiState inboxUiState = (InboxUiState) mutableStateA.getD();
                        composer2.o(1849434622);
                        Object objG3 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG3 == composer$Companion$Empty$1) {
                            objG3 = new d(10);
                            composer2.A(objG3);
                        }
                        Function1 function1 = (Function1) objG3;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                        if (objE == composer$Companion$Empty$1) {
                            objE = new d(11);
                            composer2.A(objE);
                        }
                        composer2.l();
                        final Function1 function12 = cVar;
                        final MutableState mutableState2 = mutableState;
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        AnimatedContentKt.b(inboxUiState, null, function1, null, "uiState", (Function1) objE, ComposableLambdaKt.c(1942483185, new Function4<AnimatedContentScope, InboxUiState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.InboxScreenKt$InboxScreen$4$1$3
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj5;
                                InboxUiState state = (InboxUiState) obj6;
                                Composer composer3 = (Composer) obj7;
                                int iIntValue2 = ((Number) obj8).intValue();
                                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                                Intrinsics.h(state, "state");
                                if (state instanceof InboxUiState.Loading) {
                                    composer3.o(-1872683666);
                                    InboxScreenKt.e(composer3, 0);
                                    composer3.l();
                                } else {
                                    boolean z2 = state instanceof InboxUiState.Error;
                                    Object obj9 = Composer.Companion.f1624a;
                                    Function1 function13 = function12;
                                    if (z2) {
                                        composer3.o(-1872557713);
                                        composer3.o(5004770);
                                        boolean zN = composer3.n(function13);
                                        Object objG4 = composer3.G();
                                        if (zN || objG4 == obj9) {
                                            objG4 = new f(22, function13);
                                            composer3.A(objG4);
                                        }
                                        composer3.l();
                                        FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(FullPageMessage.Error.ServerError.f8920a, null, null, (Function0) objG4, composer3, 1572870, 30), null, null, composer3, 0, 6);
                                        composer3.l();
                                    } else {
                                        if (!(state instanceof InboxUiState.Content)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer3, -1584428894);
                                        }
                                        composer3.o(-1872059357);
                                        InboxUiState.Content content = (InboxUiState.Content) state;
                                        boolean z3 = content.c;
                                        composer3.o(5004770);
                                        boolean zN2 = composer3.n(function13);
                                        Object objG5 = composer3.G();
                                        if (zN2 || objG5 == obj9) {
                                            objG5 = new f(23, function13);
                                            composer3.A(objG5);
                                        }
                                        composer3.l();
                                        PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z3, (Function0) objG5, composer3, 0);
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierA = TestTagKt.a(PullRefreshKt.a(companion, pullRefreshStateA, true), "PullRefresh");
                                        MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p2 = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierA);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function02);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, measurePolicyD2, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                        Function2 function22 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer3, p2, function22);
                                        }
                                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                        boolean zIsEmpty = content.f7281a.isEmpty();
                                        Function1 function14 = function12;
                                        if (zIsEmpty) {
                                            composer3.o(1899038226);
                                            InboxScreenKt.b(content.b, function14, composer3, 0);
                                            composer3.l();
                                        } else {
                                            composer3.o(1899359169);
                                            composer3.o(5004770);
                                            Object objG6 = composer3.G();
                                            if (objG6 == obj9) {
                                                objG6 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState2, 4);
                                                composer3.A(objG6);
                                            }
                                            composer3.l();
                                            InboxScreenKt.a(content, function14, (Function0) objG6, composer3, KyberEngine.KyberPolyBytes);
                                            String strC = StringResources_androidKt.c(composer3, R.string.inbox_transient_error);
                                            Boolean boolValueOf = Boolean.valueOf(content.d);
                                            composer3.o(-1224400529);
                                            boolean zN3 = composer3.n(strC) | ((((iIntValue2 & 112) ^ 48) > 32 && composer3.n(state)) || (iIntValue2 & 48) == 32) | composer3.n(function14);
                                            Object objG7 = composer3.G();
                                            if (zN3 || objG7 == obj9) {
                                                Object inboxScreenKt$InboxScreen$4$1$3$2$2$1 = new InboxScreenKt$InboxScreen$4$1$3$2$2$1(state, snackbarHostState2, strC, function14, null);
                                                composer3.A(inboxScreenKt$InboxScreen$4$1$3$2$2$1);
                                                objG7 = inboxScreenKt$InboxScreen$4$1$3$2$2$1;
                                            }
                                            composer3.l();
                                            EffectsKt.e(composer3, boolValueOf, (Function2) objG7);
                                            composer3.l();
                                        }
                                        PullRefreshIndicatorKt.a(content.c, pullRefreshStateA, BoxScopeInstance.f944a.g(companion, Alignment.Companion.b), WxTheme.a(composer3).a(), WxTheme.a(composer3).h(), composer3, 64, 32);
                                        composer3.f();
                                        composer3.l();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1794432, 10);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3462, 1010);
            if (((Boolean) mutableState.getD()).booleanValue()) {
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == obj) {
                    objG3 = new d(9);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG3);
                String strC = StringResources_androidKt.c(composerImplV, R.string.inbox_clear_all_dialog_positive);
                String strC2 = StringResources_androidKt.c(composerImplV, R.string.inbox_clear_all_dialog_negative);
                String strC3 = StringResources_androidKt.c(composerImplV, R.string.inbox_clear_all_dialog_title);
                String strC4 = StringResources_androidKt.c(composerImplV, R.string.inbox_clear_all_dialog_message);
                composerImplV.o(5004770);
                Object objG4 = composerImplV.G();
                if (objG4 == obj) {
                    objG4 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e(mutableState, 3);
                    composerImplV.A(objG4);
                }
                Function0 function0 = (Function0) objG4;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean zN = composerImplV.n(cVar);
                Object objG5 = composerImplV.G();
                if (zN || objG5 == obj) {
                    objG5 = new e(3, mutableState, cVar);
                    composerImplV.A(objG5);
                }
                Function0 function02 = (Function0) objG5;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean zN2 = composerImplV.n(cVar);
                Object objG6 = composerImplV.G();
                if (zN2 || objG6 == obj) {
                    objG6 = new e(4, mutableState, cVar);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                AlertDialog.f5143a.a(function0, strC, function02, strC2, (Function0) objG6, modifierB, strC3, strC4, null, 0L, 0L, composerImplV, 6, 7936);
                composerImpl = composerImplV;
            } else {
                composerImpl = composerImplV;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(viewModel, onOpenTermsAndConditions, onNavigateUp, openAskOlive, str, i, 7);
        }
    }

    public static final void d(LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem, Function0 function0, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1771807681);
        int i2 = (composerImplV.n(lastUnreadChatbotMessageItem) ? 4 : 2) | i | (composerImplV.I(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MessageUsBannerKt.a(lastUnreadChatbotMessageItem, function0, null, composerImplV, i2 & 126);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(lastUnreadChatbotMessageItem, i, 6, function0);
        }
    }

    public static final void e(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(755411149);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = TestTagKt.a(SizeKt.c, "Loading");
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 29, WxTheme.a(composerImplV).h(), 0L, composerImplV, null);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 20);
        }
    }

    public static final void f(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1701124252);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(8), Alignment.Companion.n, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.b(DeleteKt.a(), null, SizeKt.q(companion, 32), 0L, composerImplV, 432, 8);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.inbox_clear_item), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 0, 0, 65534);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.instore.wifi.ui.b(i, 19);
        }
    }
}

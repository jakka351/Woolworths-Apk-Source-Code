package au.com.woolworths.shop.checkout.ui.compose;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsItem;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsState;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsGroup;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? arrayList;
        FulfilmentWindowsOption fulfilmentWindowsOption;
        FulfilmentWindows fulfilmentWindows;
        FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState;
        ArrayList arrayList2;
        FulfilmentWindowsGroup fulfilmentWindowsGroup;
        ArrayList arrayList3;
        switch (this.d) {
            case 0:
                Function1 function1 = (Function1) this.e;
                BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = (BasicCoreBroadcastBannerModel) this.f;
                ActionData it = (ActionData) obj;
                Intrinsics.h(it, "it");
                function1.invoke(basicCoreBroadcastBannerModel);
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.e;
                ComposeView composeView = (ComposeView) this.f;
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                Intrinsics.h(addCallback, "$this$addCallback");
                viewGroup.removeView(composeView);
                break;
            case 2:
                BrandLabel brandLabel = (BrandLabel) this.e;
                Context context = (Context) this.f;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                Text accessibilityText = brandLabel.getAccessibilityText();
                SemanticsPropertiesKt.k(semantics, String.valueOf(accessibilityText != null ? accessibilityText.getText(context) : null));
                break;
            case 3:
                final List list = (List) this.f;
                final Function1 function12 = (Function1) this.e;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyColumn.b(list.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionsPageContentUi$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.compose.FulfilmentSelectionOptionsUiKt$FulfilmentSelectionOptionsPageContentUi$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
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
                            FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption = (FulfilmentSlotSelectionOption) list.get(iIntValue);
                            composer.o(485799850);
                            FulfilmentSelectionOptionsUiKt.b(fulfilmentSlotSelectionOption, function12, null, composer, 0);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            case 4:
                Text text = (Text) this.e;
                Context context2 = (Context) this.f;
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.k(semantics2, text.getText(context2).toString());
                break;
            default:
                FulfilmentWindowsViewModel fulfilmentWindowsViewModel = (FulfilmentWindowsViewModel) this.e;
                FulfilmentWindowsSlot slot = (FulfilmentWindowsSlot) this.f;
                FulfilmentSlotSelectionOptionId selectionOptionId = (FulfilmentSlotSelectionOptionId) obj;
                Intrinsics.h(selectionOptionId, "selectionOptionId");
                fulfilmentWindowsViewModel.getClass();
                Intrinsics.h(slot, "slot");
                int i = slot.d;
                FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState2 = slot.k;
                int i2 = 10;
                if (fulfilmentSlotSelectionOptionsState2 != null) {
                    Iterable<FulfilmentSlotSelectionOptionsItem> iterable = (Iterable) fulfilmentSlotSelectionOptionsState2.f10608a;
                    arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
                    for (FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem : iterable) {
                        FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId = fulfilmentSlotSelectionOptionsItem.f10607a;
                        arrayList.add(new FulfilmentSlotSelectionOptionsItem(fulfilmentSlotSelectionOptionId, fulfilmentSlotSelectionOptionsItem.b, fulfilmentSlotSelectionOptionId == selectionOptionId));
                    }
                } else {
                    arrayList = EmptyList.d;
                }
                FulfilmentSlotSelectionOptionsState fulfilmentSlotSelectionOptionsState3 = new FulfilmentSlotSelectionOptionsState(arrayList);
                MutableStateFlow mutableStateFlow = fulfilmentWindowsViewModel.k;
                FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
                if (viewState != null && (fulfilmentWindowsOption = viewState.d) != null) {
                    List<FulfilmentWindowsGroup> list2 = fulfilmentWindowsOption.m;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list2, 10));
                    for (FulfilmentWindowsGroup fulfilmentWindowsGroup2 : list2) {
                        List<FulfilmentWindowsSlot> list3 = fulfilmentWindowsGroup2.f;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(list3, i2));
                        for (FulfilmentWindowsSlot fulfilmentWindowsSlot : list3) {
                            int i3 = fulfilmentWindowsSlot.d;
                            if (i3 != i) {
                                fulfilmentSlotSelectionOptionsState = fulfilmentSlotSelectionOptionsState3;
                                fulfilmentWindowsGroup = fulfilmentWindowsGroup2;
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                            } else {
                                fulfilmentSlotSelectionOptionsState = fulfilmentSlotSelectionOptionsState3;
                                arrayList2 = arrayList4;
                                fulfilmentWindowsGroup = fulfilmentWindowsGroup2;
                                arrayList3 = arrayList5;
                                fulfilmentWindowsSlot = new FulfilmentWindowsSlot(fulfilmentWindowsSlot.f10617a, fulfilmentWindowsSlot.b, fulfilmentWindowsSlot.c, i3, fulfilmentWindowsSlot.e, fulfilmentWindowsSlot.f, fulfilmentWindowsSlot.g, fulfilmentWindowsSlot.h, fulfilmentWindowsSlot.i, fulfilmentWindowsSlot.j, fulfilmentSlotSelectionOptionsState, fulfilmentWindowsSlot.l, fulfilmentWindowsSlot.m);
                            }
                            arrayList3.add(fulfilmentWindowsSlot);
                            arrayList4 = arrayList2;
                            fulfilmentWindowsGroup2 = fulfilmentWindowsGroup;
                            arrayList5 = arrayList3;
                            fulfilmentSlotSelectionOptionsState3 = fulfilmentSlotSelectionOptionsState;
                        }
                        FulfilmentWindowsGroup fulfilmentWindowsGroup3 = fulfilmentWindowsGroup2;
                        arrayList4.add(new FulfilmentWindowsGroup(fulfilmentWindowsGroup3.f10613a, fulfilmentWindowsGroup3.b, fulfilmentWindowsGroup3.c, fulfilmentWindowsGroup3.d, fulfilmentWindowsGroup3.e, arrayList5, fulfilmentWindowsGroup3.g));
                        fulfilmentSlotSelectionOptionsState3 = fulfilmentSlotSelectionOptionsState3;
                        i2 = 10;
                    }
                    FulfilmentWindowsOption fulfilmentWindowsOptionA = FulfilmentWindowsOption.a(fulfilmentWindowsOption, false, null, arrayList4, 28671);
                    FulfilmentWindowsContract.ViewState viewState2 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
                    if (viewState2 != null && (fulfilmentWindows = viewState2.c) != null) {
                        fulfilmentWindowsViewModel.z6(fulfilmentWindows, fulfilmentWindowsOptionA);
                    }
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(List list, Function1 function1) {
        this.d = 3;
        this.f = list;
        this.e = function1;
    }
}

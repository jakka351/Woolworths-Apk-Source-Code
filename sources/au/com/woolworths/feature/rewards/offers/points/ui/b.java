package au.com.woolworths.feature.rewards.offers.points.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ RewardsPointsViewModel e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(AppCompatActivity appCompatActivity, RewardsPointsViewModel rewardsPointsViewModel) {
        this.d = 2;
        this.f = appCompatActivity;
        this.e = rewardsPointsViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        boolean zC = false;
        byte b = 0;
        final int i2 = 1;
        Unit unit = Unit.f24250a;
        RewardsPointsViewModel rewardsPointsViewModel = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                final MutableIntState mutableIntState = (MutableIntState) obj2;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.h(it, "it");
                final int iA = (int) (it.a() & 4294967295L);
                mutableIntState.i((int) Float.intBitsToFloat((int) (4294967295L & it.y(0L))));
                final Function0 function0 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int iD;
                        switch (i2) {
                            case 0:
                                iD = mutableIntState.d();
                                break;
                            default:
                                iD = mutableIntState.d();
                                break;
                        }
                        return Integer.valueOf(iD);
                    }
                };
                rewardsPointsViewModel.y2();
                rewardsPointsViewModel.b3(new Function1() { // from class: au.com.woolworths.rewards.base.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        LocalScrollStatus update = (LocalScrollStatus) obj3;
                        Intrinsics.h(update, "$this$update");
                        RewardsPageScrollManager.Status status = update.b;
                        Intrinsics.h(status, "<this>");
                        Function0 top = function0;
                        Intrinsics.h(top, "top");
                        if (status.f9351a != RewardsPageScrollManager.Kind.f) {
                            status = new RewardsPageScrollManager.Status(RewardsPageScrollManager.Kind.e, iA, top);
                        }
                        update.b = status;
                        return Unit.f24250a;
                    }
                });
                break;
            case 1:
                final MutableIntState mutableIntState2 = (MutableIntState) obj2;
                final int iIntValue = ((Integer) obj).intValue();
                final byte b2 = b == true ? 1 : 0;
                final Function0 function02 = new Function0() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int iD;
                        switch (b2) {
                            case 0:
                                iD = mutableIntState2.d();
                                break;
                            default:
                                iD = mutableIntState2.d();
                                break;
                        }
                        return Integer.valueOf(iD);
                    }
                };
                rewardsPointsViewModel.y2();
                rewardsPointsViewModel.b3(new Function1() { // from class: au.com.woolworths.rewards.base.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        LocalScrollStatus update = (LocalScrollStatus) obj3;
                        Intrinsics.h(update, "$this$update");
                        RewardsPageScrollManager.Status status = update.b;
                        Intrinsics.h(status, "<this>");
                        Function0 top = function02;
                        Intrinsics.h(top, "top");
                        if (status.f9351a != RewardsPageScrollManager.Kind.f) {
                            status = new RewardsPageScrollManager.Status(RewardsPageScrollManager.Kind.e, iIntValue, top);
                        }
                        update.b = status;
                        return Unit.f24250a;
                    }
                });
                break;
            default:
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj2;
                String offerId = (String) obj;
                Intrinsics.h(offerId, "offerId");
                FeatureToggleManager featureToggleManager = rewardsPointsViewModel.t;
                Region regionA = RewardsAccountInteractorKt.a(rewardsPointsViewModel.m);
                int i3 = regionA == null ? -1 : RewardsPointsViewModel.WhenMappings.f6375a[regionA.ordinal()];
                if (i3 == 1) {
                    zC = featureToggleManager.c(RewardsBaseFeature.m);
                } else if (i3 == 2) {
                    zC = featureToggleManager.c(RewardsBaseFeature.l);
                }
                if (!zC) {
                    int i4 = RewardsOfferDetailsActivityLegacy.x;
                    RewardsOfferDetailsActivityLegacy.Companion.a(appCompatActivity, offerId);
                    break;
                } else {
                    int i5 = OfferDetailsActivity.x;
                    OfferDetailsActivity.Companion.a(appCompatActivity, offerId);
                    break;
                }
        }
        return unit;
    }

    public /* synthetic */ b(RewardsPointsViewModel rewardsPointsViewModel, MutableIntState mutableIntState, int i) {
        this.d = i;
        this.e = rewardsPointsViewModel;
        this.f = mutableIntState;
    }
}

package com.woolworths.scanlibrary.domain.login;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.source.remote.RewardPreAuthService;
import com.woolworths.scanlibrary.models.authentication.reward.RewardSignInPreAuthResponse;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/RewardSignInPreAuthUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/login/RewardSignInPreAuthUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/login/RewardSignInPreAuthUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardSignInPreAuthUC extends UseCase<RequestValues, ResponseValue> {
    public final RewardPreAuthService c;
    public final DeviceInfoProvider d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/RewardSignInPreAuthUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/login/RewardSignInPreAuthUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardSignInPreAuthUC(RewardPreAuthService rewardPreAuthService, DefaultLocalTokenProvider defaultLocalTokenProvider, DeviceInfoProvider deviceInfoProvider, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        this.c = rewardPreAuthService;
        this.d = deviceInfoProvider;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        Single<RewardSignInPreAuthResponse> singleA = this.c.a(this.d.getDeviceId());
        com.woolworths.scanlibrary.data.authentication.token.b bVar = new com.woolworths.scanlibrary.data.authentication.token.b(new au.com.woolworths.shop.ratingsandreviews.ui.shared.a(20), 15);
        singleA.getClass();
        return new SingleMap(singleA, bVar);
    }
}

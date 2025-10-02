package com.woolworths.scanlibrary.domain.device;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.cart.ui.cart.l;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.models.device.DeviceCloudInfo;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/device/DeviceRegistrationUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/device/DeviceRegistrationUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/device/DeviceRegistrationUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceRegistrationUC extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;
    public final DeviceInfoProvider d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/device/DeviceRegistrationUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public String f21179a;
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/device/DeviceRegistrationUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceRegistrationUC(ScanNGoRepository scanNGoRepository, DeviceInfoProvider deviceInfoProvider, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        this.c = scanNGoRepository;
        this.d = deviceInfoProvider;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        RequestValues requestValues2 = (RequestValues) requestValues;
        Single<ResponseBody> singleD = this.c.f21149a.f21163a.D(new DeviceCloudInfo(this.d.getDeviceId(), requestValues2.f21179a));
        b bVar = new b(new l(26, this, requestValues2), 8);
        singleD.getClass();
        return new SingleFlatMap(singleD, bVar);
    }
}

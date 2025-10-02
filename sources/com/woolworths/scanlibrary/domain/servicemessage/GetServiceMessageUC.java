package com.woolworths.scanlibrary.domain.servicemessage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.domain.productsearch.a;
import com.woolworths.scanlibrary.models.notification.Notifications;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC$RequestValues;", "Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetServiceMessageUC extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;
    public final DeviceInfoProvider d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/servicemessage/GetServiceMessageUC$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final Notifications f21204a;

        public ResponseValue(Notifications message) {
            Intrinsics.h(message, "message");
            this.f21204a = message;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetServiceMessageUC(ScanNGoRepository scanNGoRepository, DeviceInfoProvider deviceInfoProvider, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        this.c = scanNGoRepository;
        this.d = deviceInfoProvider;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        DeviceInfoProvider deviceInfoProvider = this.d;
        String appId = deviceInfoProvider.getAppId();
        String deviceId = deviceInfoProvider.getDeviceId();
        String osVersion = deviceInfoProvider.getOsVersion();
        String appVersion = deviceInfoProvider.getAppVersion();
        ScanNGoRepository scanNGoRepository = this.c;
        scanNGoRepository.getClass();
        Intrinsics.h(appId, "appId");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(appVersion, "appVersion");
        return new SingleMap(scanNGoRepository.f21149a.f21163a.C(appId, deviceId, osVersion, appVersion).h(scanNGoRepository.b), new c(new a(7), 15));
    }
}

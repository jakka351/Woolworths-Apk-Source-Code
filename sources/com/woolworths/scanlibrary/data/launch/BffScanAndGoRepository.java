package com.woolworths.scanlibrary.data.launch;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.data.source.remote.BffDataSource;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/launch/BffScanAndGoRepository;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BffScanAndGoRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Application f21160a;
    public final BffDataSource b;
    public final DeviceInfoProvider c;

    public BffScanAndGoRepository(Application application, BffDataSource bffDataSource, DeviceInfoProvider deviceInfoProvider, SharedPreferences sharedPreferences) {
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        this.f21160a = application;
        this.b = bffDataSource;
        this.c = deviceInfoProvider;
    }
}

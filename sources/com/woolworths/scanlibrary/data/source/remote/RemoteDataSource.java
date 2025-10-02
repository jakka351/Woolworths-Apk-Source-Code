package com.woolworths.scanlibrary.data.source.remote;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.woolworths.scanlibrary.data.ScanNGoDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/source/remote/RemoteDataSource;", "Lcom/woolworths/scanlibrary/data/ScanNGoDataSource;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteDataSource implements ScanNGoDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final ApigeeDataSource f21163a;
    public final FeatureToggleManager b;

    public RemoteDataSource(ApigeeDataSource apigeeDataSource, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f21163a = apigeeDataSource;
        this.b = featureToggleManager;
    }
}

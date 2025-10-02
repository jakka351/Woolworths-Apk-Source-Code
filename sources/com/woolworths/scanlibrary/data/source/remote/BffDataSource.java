package com.woolworths.scanlibrary.data.source.remote;

import au.com.woolworths.android.onesite.network.Component;
import com.woolworths.scanlibrary.data.launch.ScanAndGoClientData;
import com.woolworths.scanlibrary.data.launch.ScanAndGoUserData;
import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/data/source/remote/BffDataSource;", "", "Lcom/woolworths/scanlibrary/data/launch/ScanAndGoClientData;", "scanAndAndGoClientData", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/network/Component;", "Lcom/woolworths/scanlibrary/data/launch/ScanAndGoUserData;", "a", "(Lcom/woolworths/scanlibrary/data/launch/ScanAndGoClientData;)Lio/reactivex/Single;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BffDataSource {
    @POST("hermes/iris/v1/scango/login")
    @NotNull
    Single<Component<ScanAndGoUserData>> a(@Body @NotNull ScanAndGoClientData scanAndAndGoClientData);
}

package au.com.woolworths.scanandgo.storage;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/scanandgo/storage/ScanAndGoLocalStorage;", "", "Companion", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScanAndGoLocalStorage {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f9983a;
    public final SharedPreferences b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/scanandgo/storage/ScanAndGoLocalStorage$Companion;", "", "", "PREFS_USER_DATA", "Ljava/lang/String;", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ScanAndGoLocalStorage(SharedPreferences sharedPreferences, Gson gson) {
        this.f9983a = gson;
        this.b = sharedPreferences;
    }
}

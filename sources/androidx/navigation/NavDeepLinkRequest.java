package androidx.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "Builder", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class NavDeepLinkRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3483a;
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }
    }

    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.f3483a = uri;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f3483a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}

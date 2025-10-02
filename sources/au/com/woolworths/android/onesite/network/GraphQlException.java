package au.com.woolworths.android.onesite.network;

import com.apollographql.apollo.api.Error;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphQlException extends Exception {
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    public GraphQlException(List list) {
        Iterator it = list.iterator();
        String strO = "GraphQL errors:";
        while (it.hasNext()) {
            strO = androidx.camera.core.impl.b.o(strO, "\n - ", ((Error) it.next()).getF13514a());
        }
        super(strO);
        this.d = list;
    }
}

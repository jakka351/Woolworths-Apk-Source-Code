package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/RemoteEntry;", "", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteEntry {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f2537a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/RemoteEntry$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/credentials/provider/RemoteEntry$Companion;", "", "", "REVISION_ID", "I", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static RemoteEntry a(Slice slice) {
            List<SliceItem> items = slice.getItems();
            Intrinsics.g(items, "slice.items");
            PendingIntent action = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItem.getAction();
                }
            }
            try {
                Intrinsics.e(action);
                return new RemoteEntry(action);
            } catch (Exception e) {
                Log.i("RemoteEntry", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }

        public static Slice b(RemoteEntry remoteEntry) {
            Intrinsics.h(remoteEntry, "remoteEntry");
            PendingIntent pendingIntent = remoteEntry.f2537a;
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("RemoteEntry", 1));
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            Slice sliceBuild = builder.build();
            Intrinsics.g(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    public RemoteEntry(PendingIntent pendingIntent) {
        this.f2537a = pendingIntent;
    }
}

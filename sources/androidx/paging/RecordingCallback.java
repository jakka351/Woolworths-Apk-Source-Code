package androidx.paging;

import androidx.paging.PagedList;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/RecordingCallback;", "Landroidx/paging/PagedList$Callback;", "Companion", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecordingCallback extends PagedList.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3586a = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/paging/RecordingCallback$Companion;", "", "", "Changed", "I", "Inserted", "Removed", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.paging.PagedList.Callback
    public final void a(int i, int i2) {
        ArrayList arrayList = this.f3586a;
        arrayList.add(0);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }

    @Override // androidx.paging.PagedList.Callback
    public final void b(int i, int i2) {
        ArrayList arrayList = this.f3586a;
        arrayList.add(1);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }

    @Override // androidx.paging.PagedList.Callback
    public final void c(int i, int i2) {
        ArrayList arrayList = this.f3586a;
        arrayList.add(2);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }
}

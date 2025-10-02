package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class BaseDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2954a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public DataSpec d;

    public BaseDataSource(boolean z) {
        this.f2954a = z;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(transferListener)) {
            return;
        }
        arrayList.add(transferListener);
        this.c++;
    }

    public final void m(int i) {
        DataSpec dataSpec = this.d;
        int i2 = Util.f2928a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((TransferListener) this.b.get(i3)).d(dataSpec, this.f2954a, i);
        }
    }

    public final void n() {
        DataSpec dataSpec = this.d;
        int i = Util.f2928a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((TransferListener) this.b.get(i2)).c(dataSpec, this.f2954a);
        }
        this.d = null;
    }

    public final void o(DataSpec dataSpec) {
        for (int i = 0; i < this.c; i++) {
            ((TransferListener) this.b.get(i)).b(dataSpec, this.f2954a);
        }
    }

    public final void p(DataSpec dataSpec) {
        this.d = dataSpec;
        for (int i = 0; i < this.c; i++) {
            ((TransferListener) this.b.get(i)).g(dataSpec, this.f2954a);
        }
    }
}

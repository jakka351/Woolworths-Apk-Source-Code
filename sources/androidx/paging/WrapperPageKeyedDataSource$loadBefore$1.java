package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/paging/WrapperPageKeyedDataSource$loadBefore$1", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WrapperPageKeyedDataSource$loadBefore$1 extends PageKeyedDataSource.LoadCallback<Object, Object> {
    @Override // androidx.paging.PageKeyedDataSource.LoadCallback
    public final void a(Object obj, List list) {
        DataSource.Companion.a(list);
        throw null;
    }
}

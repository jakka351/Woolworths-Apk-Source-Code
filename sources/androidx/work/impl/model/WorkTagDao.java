package androidx.work.impl.model;

import androidx.room.Dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface WorkTagDao {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default void a(String id, Set tags) {
        Intrinsics.h(id, "id");
        Intrinsics.h(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            c(new WorkTag((String) it.next(), id));
        }
    }

    ArrayList b(String str);

    void c(WorkTag workTag);
}

package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.room.RoomTrackingLiveData;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes.dex */
public interface WorkSpecDao {
    void A(String str, Data data);

    ArrayList B();

    void C(int i, String str);

    ArrayList D();

    int E(String str);

    void a(String str);

    RoomTrackingLiveData b();

    void c(WorkSpec workSpec);

    ArrayList d(String str);

    WorkInfo.State e(String str);

    ArrayList f();

    int g(String str);

    ArrayList h(String str);

    ArrayList i(String str);

    int j(WorkInfo.State state, String str);

    void k(long j, String str);

    ArrayList l();

    int m(String str);

    int n();

    void o(String str);

    int p(long j, String str);

    ArrayList q(long j);

    void r(int i, String str);

    ArrayList s();

    WorkSpec t(String str);

    int u();

    ArrayList v();

    ArrayList w();

    ArrayList x(String str);

    Flow y();

    ArrayList z(int i);
}

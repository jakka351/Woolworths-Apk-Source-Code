package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import kotlin.Metadata;

@TypeConverters
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Database
@RestrictTo
/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public abstract WorkTagDao A();

    public abstract DependencyDao t();

    public abstract PreferenceDao u();

    public abstract RawWorkInfoDao v();

    public abstract SystemIdInfoDao w();

    public abstract WorkNameDao x();

    public abstract WorkProgressDao y();

    public abstract WorkSpecDao z();
}

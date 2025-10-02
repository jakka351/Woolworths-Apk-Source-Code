package androidx.work.impl.workers;

import YU.a;
import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DiagnosticsWorkerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4016a;

    static {
        String strG = Logger.g("DiagnosticsWrkr");
        Intrinsics.g(strG, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f4016a = strG;
    }

    public static final String a(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
            String str = workSpec.f3990a;
            SystemIdInfo systemIdInfoD = systemIdInfoDao.d(workGenerationalIdA);
            Integer numValueOf = systemIdInfoD != null ? Integer.valueOf(systemIdInfoD.c) : null;
            String strM = CollectionsKt.M(workNameDao.b(str), ",", null, null, null, 62);
            String strM2 = CollectionsKt.M(workTagDao.b(str), ",", null, null, null, 62);
            StringBuilder sbU = a.u("\n", str, "\t ");
            sbU.append(workSpec.c);
            sbU.append("\t ");
            sbU.append(numValueOf);
            sbU.append("\t ");
            sbU.append(workSpec.b.name());
            sbU.append("\t ");
            sbU.append(strM);
            sbU.append("\t ");
            sbU.append(strM2);
            sbU.append('\t');
            sb.append(sbU.toString());
        }
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

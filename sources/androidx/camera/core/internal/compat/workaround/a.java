package androidx.camera.core.internal.compat.workaround;

import android.media.MediaCodec;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.SessionConfig;
import com.google.firebase.firestore.model.Document;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj2;
                ((SurfaceSorter) this.e).getClass();
                Class cls = ((SessionConfig.OutputConfig) obj).f().j;
                int i = 1;
                int i2 = cls == MediaCodec.class ? 2 : cls == Preview.class ? 0 : 1;
                Class cls2 = outputConfig.f().j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == Preview.class) {
                    i = 0;
                }
                return i2 - i;
            case 1:
                Document document = (Document) obj;
                Document document2 = (Document) obj2;
                int iCompare = ((Comparator) this.e).compare(document, document2);
                return iCompare == 0 ? document.getKey().compareTo(document2.getKey()) : iCompare;
            default:
                for (Function1 function1 : (Function1[]) this.e) {
                    int iA = ComparisonsKt.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
        }
    }
}

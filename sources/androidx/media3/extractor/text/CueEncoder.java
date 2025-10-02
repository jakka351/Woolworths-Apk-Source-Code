package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

@UnstableApi
/* loaded from: classes2.dex */
public final class CueEncoder {
    public static byte[] a(ImmutableList immutableList, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Cue) it.next()).c());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}

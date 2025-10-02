package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzic implements zzih {
    private static final boolean zzb(int i) throws IOException {
        try {
            new Socket("localhost", i).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    @Nullable
    public final Object zza(@NotNull Object... objArr) throws zzce {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                throw new zzce(4, 5, null);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (zzb(iIntValue)) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList2;
    }
}

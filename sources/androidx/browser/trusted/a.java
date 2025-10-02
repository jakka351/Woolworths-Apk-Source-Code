package androidx.browser.trusted;

import android.util.Range;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import androidx.media3.datasource.cache.CacheSpan;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Util;
import com.scandit.datacapture.core.AbstractC1001f2;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr != bArr2) {
                    if (bArr == null) {
                        return -1;
                    }
                    if (bArr2 == null) {
                        return 1;
                    }
                    for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
                        byte b = bArr[i];
                        byte b2 = bArr2[i];
                        if (b != b2) {
                            return b - b2;
                        }
                    }
                    if (bArr.length != bArr2.length) {
                        return bArr.length - bArr2.length;
                    }
                }
                return 0;
            case 1:
                a aVar = OptionsBundle.H;
                return ((Config.Option) obj).c().compareTo(((Config.Option) obj2).c());
            case 2:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.e).intValue() - ((Number) pair.d).intValue()) - (((Number) pair2.e).intValue() - ((Number) pair2.d).intValue());
            case 3:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 4:
                CacheSpan cacheSpan = (CacheSpan) obj;
                CacheSpan cacheSpan2 = (CacheSpan) obj2;
                long j = cacheSpan.i;
                long j2 = cacheSpan2.i;
                return j - j2 == 0 ? cacheSpan.compareTo(cacheSpan2) : j < j2 ? -1 : 1;
            case 5:
                return (((SavedGiftCardData) obj2).isExpired() ? 1 : 0) - (((SavedGiftCardData) obj).isExpired() ? 1 : 0);
            case 6:
                return ((CrashlyticsReport.CustomAttribute) obj).b().compareTo(((CrashlyticsReport.CustomAttribute) obj2).b());
            case 7:
                Charset charset = CrashlyticsReportPersistence.e;
                String name = ((File) obj).getName();
                int i2 = CrashlyticsReportPersistence.f;
                return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
            case 8:
                return ((DocumentKey) obj).compareTo((DocumentKey) obj2);
            case 9:
                return FieldIndex.IndexOffset.d((MutableDocument) obj).compareTo(FieldIndex.IndexOffset.d((MutableDocument) obj2));
            case 10:
                return ((FieldFilter) obj).c.compareTo(((FieldFilter) obj2).c);
            case 11:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 12:
                int i3 = Util.f15603a;
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 13:
                return AbstractC1001f2.a((Range) obj, (Range) obj2);
            default:
                return AbstractC1001f2.b((Range) obj, (Range) obj2);
        }
    }
}

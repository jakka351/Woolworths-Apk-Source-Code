package au.com.woolworths.feature.shop.voc.freetext;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.voc.VocRepository;
import au.com.woolworths.feature.shop.voc.score.VocDeviceInfoInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextInteractor;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VocFreeTextInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final VocDeviceInfoInteractor f8228a;
    public final VocRepository b;

    public VocFreeTextInteractor(VocDeviceInfoInteractor vocDeviceInfoInteractor, VocRepository vocRepository) {
        this.f8228a = vocDeviceInfoInteractor;
        this.b = vocRepository;
    }

    public static void a(Exception exc, String str) {
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.m), exc, "Could not sent VoC free text for surveyId: " + str, 8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|57|(1:(1:(4:13|14|51|52)(2:22|23))(4:24|55|25|26))(4:34|35|(1:38)|41)|27|53|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r1.b(r9, r3, r4, (au.com.woolworths.shop.graphql.type.DeviceInfo) r12, r6) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        r7 = r10;
        r10 = r0;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        r7 = r10;
        r10 = r0;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        r7 = r10;
        r10 = r0;
        r9 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.feature.shop.voc.data.SurveySubmitData r9, int r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextInteractor.b(au.com.woolworths.feature.shop.voc.data.SurveySubmitData, int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

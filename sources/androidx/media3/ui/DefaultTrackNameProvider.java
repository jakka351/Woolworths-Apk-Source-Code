package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3453a;

    public DefaultTrackNameProvider(Resources resources) {
        resources.getClass();
        this.f3453a = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    @Override // androidx.media3.ui.TrackNameProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(androidx.media3.common.Format r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTrackNameProvider.a(androidx.media3.common.Format):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(androidx.media3.common.Format r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L34
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            int r2 = androidx.media3.common.util.Util.f2928a
            r4 = 24
            if (r2 < r4) goto L26
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            goto L2a
        L26:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L2a:
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L36
        L34:
            r0 = r3
            goto L57
        L36:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L57
        L57:
            java.lang.String r8 = r7.c(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.d(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L71
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L70
            r1 = r3
        L70:
            r8 = r1
        L71:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTrackNameProvider.b(androidx.media3.common.Format):java.lang.String");
    }

    public final String c(Format format) throws Resources.NotFoundException {
        int i = format.f;
        int i2 = format.f;
        int i3 = i & 2;
        Resources resources = this.f3453a;
        String string = i3 != 0 ? resources.getString(com.woolworths.R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = d(string, resources.getString(com.woolworths.R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = d(string, resources.getString(com.woolworths.R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? d(string, resources.getString(com.woolworths.R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) throws Resources.NotFoundException {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f3453a.getString(com.woolworths.R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}

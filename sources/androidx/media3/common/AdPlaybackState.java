package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@UnstableApi
/* loaded from: classes2.dex */
public final class AdPlaybackState {
    public static final AdPlaybackState c = new AdPlaybackState(new AdGroup[0]);
    public static final AdGroup d;

    /* renamed from: a, reason: collision with root package name */
    public final int f2843a;
    public final AdGroup[] b;

    public static final class AdGroup {

        /* renamed from: a, reason: collision with root package name */
        public final int f2844a;
        public final int b;
        public final Uri[] c;
        public final MediaItem[] d;
        public final int[] e;
        public final long[] f;
        public final String[] g;

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
            androidx.compose.ui.input.pointer.a.r(5, 6, 7, 8, 9);
            Util.E(10);
        }

        public AdGroup(int i, int i2, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, String[] strArr) {
            Uri uri;
            int i3 = 0;
            Assertions.b(iArr.length == mediaItemArr.length);
            this.f2844a = i;
            this.b = i2;
            this.e = iArr;
            this.d = mediaItemArr;
            this.f = jArr;
            this.c = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.c;
                if (i3 >= uriArr.length) {
                    this.g = strArr;
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i3];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.b;
                    localConfiguration.getClass();
                    uri = localConfiguration.f2863a;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.e;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.f2844a == adGroup.f2844a && this.b == adGroup.b && Arrays.equals(this.d, adGroup.d) && Arrays.equals(this.e, adGroup.e) && Arrays.equals(this.f, adGroup.f) && Arrays.equals(this.g, adGroup.g);
        }

        public final int hashCode() {
            int i = ((this.f2844a * 31) + this.b) * 31;
            int i2 = (int) 0;
            return (((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((i + i2) * 31)) * 31)) * 31)) * 31) + i2) * 961) + Arrays.hashCode(this.g)) * 31;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    static {
        AdGroup adGroup = new AdGroup(-1, -1, new int[0], new MediaItem[0], new long[0], new String[0]);
        int[] iArr = adGroup.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = adGroup.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        d = new AdGroup(0, adGroup.b, iArrCopyOf, (MediaItem[]) Arrays.copyOf(adGroup.d, 0), jArrCopyOf, (String[]) Arrays.copyOf(adGroup.g, 0));
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
    }

    public AdPlaybackState(AdGroup[] adGroupArr) {
        this.f2843a = adGroupArr.length;
        this.b = adGroupArr;
    }

    public final AdGroup a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean b(int i) {
        if (i != this.f2843a - 1) {
            return false;
        }
        a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return this.f2843a == adPlaybackState.f2843a && Arrays.equals(this.b, adPlaybackState.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.f2843a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            AdGroup[] adGroupArr = this.b;
            if (i >= adGroupArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            adGroupArr[i].getClass();
            for (int i2 = 0; i2 < adGroupArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = adGroupArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(adGroupArr[i].f[i2]);
                sb.append(')');
                if (i2 < adGroupArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < adGroupArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}

package androidx.privacysandbox.ads.adservices.topics;

import YU.a;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@ExperimentalFeatures.Ext11OptIn
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EncryptedTopic {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3632a;
    public final String b;
    public final byte[] c;

    public EncryptedTopic(byte[] bArr, String str, byte[] bArr2) {
        this.f3632a = bArr;
        this.b = str;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedTopic)) {
            return false;
        }
        EncryptedTopic encryptedTopic = (EncryptedTopic) obj;
        return Arrays.equals(this.f3632a, encryptedTopic.f3632a) && this.b.contentEquals(encryptedTopic.b) && Arrays.equals(this.c, encryptedTopic.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f3632a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        return a.A("EncryptedTopic { ", "EncryptedTopic=" + StringsKt.r(this.f3632a) + ", KeyIdentifier=" + this.b + ", EncapsulatedKey=" + StringsKt.r(this.c) + " }");
    }
}

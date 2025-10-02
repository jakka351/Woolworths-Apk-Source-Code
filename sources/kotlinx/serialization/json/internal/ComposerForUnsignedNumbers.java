package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import org.bouncycastle.crypto.hpke.HPKE;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressAnimalSniffer
/* loaded from: classes7.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    public final boolean c;

    public ComposerForUnsignedNumbers(JsonToStringWriter jsonToStringWriter, boolean z) {
        super(jsonToStringWriter);
        this.c = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void d(byte b) {
        if (this.c) {
            j(String.valueOf(b & 255));
        } else {
            h(String.valueOf(b & 255));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void f(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void g(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void i(short s) {
        if (this.c) {
            j(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
        } else {
            h(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
        }
    }
}

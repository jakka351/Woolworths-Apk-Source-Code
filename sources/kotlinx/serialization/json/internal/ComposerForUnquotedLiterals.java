package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressAnimalSniffer
/* loaded from: classes7.dex */
public final class ComposerForUnquotedLiterals extends Composer {
    public final boolean c;

    public ComposerForUnquotedLiterals(JsonToStringWriter jsonToStringWriter, boolean z) {
        super(jsonToStringWriter);
        this.c = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void j(String value) {
        Intrinsics.h(value, "value");
        if (this.c) {
            super.j(value);
        } else {
            h(value);
        }
    }
}

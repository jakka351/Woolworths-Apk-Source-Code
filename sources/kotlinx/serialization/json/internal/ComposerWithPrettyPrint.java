package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerWithPrettyPrint;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ComposerWithPrettyPrint extends Composer {
    public int c;

    @Override // kotlinx.serialization.json.internal.Composer
    public final void a() {
        this.b = true;
        this.c++;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void b() {
        this.b = false;
        h("\n");
        if (this.c > 0) {
            throw null;
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void c() {
        if (this.b) {
            this.b = false;
        } else {
            b();
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void k() {
        e(' ');
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void l() {
        this.c--;
    }
}

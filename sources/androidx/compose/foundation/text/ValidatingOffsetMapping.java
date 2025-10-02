package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/ValidatingOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ValidatingOffsetMapping implements OffsetMapping {

    /* renamed from: a, reason: collision with root package name */
    public final OffsetMapping f1144a;
    public final int b;
    public final int c;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i, int i2) {
        this.f1144a = offsetMapping;
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int a(int i) {
        int iA = this.f1144a.a(i);
        if (i >= 0 && i <= this.c) {
            ValidatingOffsetMappingKt.c(iA, this.b, i);
        }
        return iA;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int b(int i) {
        int iB = this.f1144a.b(i);
        if (i >= 0 && i <= this.b) {
            ValidatingOffsetMappingKt.b(iB, this.c, i);
        }
        return iB;
    }
}

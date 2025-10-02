package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2195a;

    public LoremIpsum(int i) {
        this.f2195a = i;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        final Ref.IntRef intRef = new Ref.IntRef();
        final int size = LoremIpsum_androidKt.f2196a.size();
        return ArraysKt.g(new String[]{SequencesKt.p(SequencesKt.w(SequencesKt.n(new Function0<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = LoremIpsum_androidKt.f2196a;
                Ref.IntRef intRef2 = intRef;
                int i = intRef2.d;
                intRef2.d = i + 1;
                return (String) list.get(i % size);
            }
        }), this.f2195a), " ", null, 62)});
    }
}

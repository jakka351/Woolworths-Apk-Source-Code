package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* loaded from: classes.dex */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static final void f(Iterable iterable, Appendable buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, Function1 function1) {
        Intrinsics.h(iterable, "<this>");
        Intrinsics.h(buffer, "buffer");
        Intrinsics.h(prefix, "prefix");
        Intrinsics.h(postfix, "postfix");
        buffer.append(prefix);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                buffer.append(charSequence);
            }
            StringsKt.l(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    public static final void g(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        Intrinsics.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}

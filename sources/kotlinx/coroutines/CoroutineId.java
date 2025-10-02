package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@IgnoreJRERequirement
@PublishedApi
/* loaded from: classes.dex */
public final /* data */ class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final Object R(CoroutineContext coroutineContext) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iF = StringsKt.F(0, 6, name, " @");
        if (iF < 0) {
            iF = name.length();
        }
        StringBuilder sb = new StringBuilder(iF + 19);
        String strSubstring = name.substring(0, iF);
        Intrinsics.g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append(" @coroutine#0");
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CoroutineId);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void i(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final String toString() {
        return "CoroutineId(0)";
    }
}

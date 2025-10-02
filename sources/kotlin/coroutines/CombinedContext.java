package kotlin.coroutines;

import au.com.woolworths.shop.productcard.ui.components.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CombinedContext implements CoroutineContext, Serializable {
    public final CoroutineContext d;
    public final CoroutineContext.Element e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class Serialized implements Serializable {
        public final CoroutineContext[] d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
        }

        public Serialized(CoroutineContext[] coroutineContextArr) {
            this.d = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.d;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.d;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    public CombinedContext(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.h(left, "left");
        Intrinsics.h(element, "element");
        this.d = left;
        this.e = element;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iB = b();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iB];
        Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.f24250a, new b(coroutineContextArr, intRef));
        if (intRef.d == iB) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int b() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.d;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.b() == b()) {
                CombinedContext combinedContext2 = this;
                while (true) {
                    CoroutineContext.Element element = combinedContext2.e;
                    if (!Intrinsics.c(combinedContext.get(element.getD()), element)) {
                        zC = false;
                        break;
                    }
                    CoroutineContext coroutineContext = combinedContext2.d;
                    if (!(coroutineContext instanceof CombinedContext)) {
                        Intrinsics.f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        zC = Intrinsics.c(combinedContext.get(element2.getD()), element2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) coroutineContext;
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.d.fold(obj, function2), this.e);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.h(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext.Element element = combinedContext.e.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = combinedContext.d;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.h(key, "key");
        CoroutineContext.Element element = this.e;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.d;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        return coroutineContextMinusKey == coroutineContext ? this : coroutineContextMinusKey == EmptyCoroutineContext.d ? element : new CombinedContext(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.h(context, "context");
        return context == EmptyCoroutineContext.d ? this : (CoroutineContext) context.fold(this, new a(0));
    }

    public final String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("["), (String) fold("", new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(20)), ']');
    }
}

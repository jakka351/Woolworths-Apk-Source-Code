package kotlin.collections.builders;

import io.jsonwebtoken.JwtParser;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerializedCollection implements Externalizable {
    public Object d;
    public final int e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public SerializedCollection(int i, Collection collection) {
        this.d = collection;
        this.e = i;
    }

    /* renamed from: readResolve, reason: from getter */
    private final Object getD() {
        return this.d;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        Object objQ;
        Intrinsics.h(input, "input");
        byte b = input.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + JwtParser.SEPARATOR_CHAR);
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + JwtParser.SEPARATOR_CHAR);
        }
        int i3 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(i2);
            while (i3 < i2) {
                listBuilder.add(input.readObject());
                i3++;
            }
            objQ = CollectionsKt.q(listBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + JwtParser.SEPARATOR_CHAR);
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(i2));
            while (i3 < i2) {
                setBuilder.add(input.readObject());
                i3++;
            }
            objQ = SetsKt.a(setBuilder);
        }
        this.d = objQ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.h(output, "output");
        output.writeByte(this.e);
        output.writeInt(this.d.size());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(0, EmptyList.d);
    }
}

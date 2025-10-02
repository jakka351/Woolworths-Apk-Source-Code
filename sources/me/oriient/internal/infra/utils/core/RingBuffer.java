package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\r\u0010\u001a\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lme/oriient/internal/infra/utils/core/RingBuffer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "size", "", "(I)V", "allElements", "", "getAllElements$annotations", "()V", "getAllElements", "()Ljava/util/List;", "array", "", "[Ljava/lang/Object;", "isEmpty", "", "()Z", "isFull", "readIndex", "writeIndex", "add", "", "element", "(Ljava/lang/Object;)V", "clear", "peek", "()Ljava/lang/Object;", "pop", "printState", "prefix", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RingBuffer<T> {

    @NotNull
    private final Object[] array;
    private int readIndex;
    private int writeIndex;

    public RingBuffer(int i) {
        this.array = new Object[i];
    }

    public static /* synthetic */ void getAllElements$annotations() {
    }

    private final void printState(String prefix) {
        StringBuilder sbT = YU.a.t(prefix, ": write = ");
        sbT.append(this.writeIndex);
        sbT.append(", read = ");
        sbT.append(this.readIndex);
        sbT.append(", isEmpty = ");
        sbT.append(isEmpty());
        sbT.append(", isFull = ");
        sbT.append(isFull());
        sbT.append(", array = ");
        String string = Arrays.toString(this.array);
        Intrinsics.g(string, "toString(...)");
        sbT.append(string);
        System.out.println((Object) sbT.toString());
    }

    public final void add(T element) {
        Object[] objArr = this.array;
        objArr[this.writeIndex % objArr.length] = element;
        if (isFull()) {
            this.readIndex++;
        }
        this.writeIndex++;
    }

    public final void clear() {
        Object[] objArr = this.array;
        ArraysKt.B(objArr, 0, objArr.length, null);
        this.readIndex = 0;
        this.writeIndex = 0;
    }

    @NotNull
    public final List<T> getAllElements() {
        Object[] objArr = this.array;
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean isEmpty() {
        return this.readIndex == this.writeIndex;
    }

    public final boolean isFull() {
        return this.writeIndex - this.readIndex >= this.array.length;
    }

    @Nullable
    public final T peek() {
        boolean zIsEmpty = isEmpty();
        if (!zIsEmpty) {
            if (zIsEmpty) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr = this.array;
            T t = (T) objArr[this.readIndex % objArr.length];
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public final T pop() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.array;
        int i = this.readIndex;
        T t = (T) objArr[i % objArr.length];
        if (t == null) {
            t = null;
        }
        objArr[i % objArr.length] = null;
        this.readIndex = i + 1;
        return t;
    }
}

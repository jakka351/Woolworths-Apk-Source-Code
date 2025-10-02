package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.camera.core.impl.b;
import com.squareup.sqldelight.db.SqlCursor;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelSegment;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.LockFreeTaskQueue;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.scheduling.Task;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import me.oriient.internal.services.elog.ELog;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.SecureRandomProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, Segment segment2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, segment2)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ConcurrentLinkedListNode concurrentLinkedListNode, Object obj, ConcurrentLinkedListNode concurrentLinkedListNode2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(concurrentLinkedListNode, obj, concurrentLinkedListNode2)) {
            if (atomicReferenceFieldUpdater.get(concurrentLinkedListNode) != obj) {
                return false;
            }
        }
        return true;
    }

    public static byte[] C(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    public static byte[] D(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    public static int a(MatLabArray matLabArray, int i, int i2) {
        return (matLabArray.hashCode() + i) * i2;
    }

    public static int b(ASN1Sequence aSN1Sequence, int i) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i)).intValueExact();
    }

    public static Double c(Double d, SqlCursor sqlCursor, int i) {
        Intrinsics.e(d);
        Double d2 = sqlCursor.getDouble(i);
        Intrinsics.e(d2);
        return d2;
    }

    public static Object d(Object obj, Map.Entry entry, HashMap map, Object obj2) {
        Objects.requireNonNull(obj);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        return map.put(obj2, value);
    }

    public static String e(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String f(String str, IOException iOException) {
        return str + iOException;
    }

    public static String g(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String h(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String i(ReflectionFactory reflectionFactory, Class cls, StringBuilder sb) {
        sb.append(reflectionFactory.b(cls));
        return sb.toString();
    }

    public static String j(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    public static /* synthetic */ Map k(Integer num) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", num)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (d(key, entry, map, key) == null) {
            return Collections.unmodifiableMap(map);
        }
        throw new IllegalArgumentException(b.m(key, "duplicate key: "));
    }

    public static /* synthetic */ Map l(String str) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("errorMessage", str)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (d(key, entry, map, key) == null) {
            return Collections.unmodifiableMap(map);
        }
        throw new IllegalArgumentException(b.m(key, "duplicate key: "));
    }

    public static /* synthetic */ Map m(String str, String str2) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("errorMessage", str), new AbstractMap.SimpleEntry("stackTrace", str2)};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            if (d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(b.m(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static ASN1EncodableVector n(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static ECFieldElement o(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static void p(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }

    public static void q(String str, String str2, ELog eLog, String str3, String str4) {
        eLog.d(str3, str4, MapsKt.i(new Pair(str, str2)));
    }

    public static /* synthetic */ void r(AtomicReference atomicReference, SecureRandomProvider secureRandomProvider) {
        while (!atomicReference.compareAndSet(null, secureRandomProvider) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ void s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, EventLoopImplBase eventLoopImplBase, EventLoopImplBase.DelayedTaskQueue delayedTaskQueue) {
        while (!atomicReferenceFieldUpdater.compareAndSet(eventLoopImplBase, null, delayedTaskQueue) && atomicReferenceFieldUpdater.get(eventLoopImplBase) == null) {
        }
    }

    public static /* synthetic */ void t(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, Object obj, Incomplete incomplete) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, obj, incomplete) && atomicReferenceFieldUpdater.get(jobSupport) == obj) {
        }
    }

    public static /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeTaskQueue lockFreeTaskQueue, LockFreeTaskQueueCore lockFreeTaskQueueCore, LockFreeTaskQueueCore lockFreeTaskQueueCore2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeTaskQueue, lockFreeTaskQueueCore, lockFreeTaskQueueCore2) && atomicReferenceFieldUpdater.get(lockFreeTaskQueue) == lockFreeTaskQueueCore) {
        }
    }

    public static /* synthetic */ void v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeTaskQueueCore lockFreeTaskQueueCore, LockFreeTaskQueueCore lockFreeTaskQueueCore2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeTaskQueueCore, null, lockFreeTaskQueueCore2) && atomicReferenceFieldUpdater.get(lockFreeTaskQueueCore) == null) {
        }
    }

    public static void w(LMSigParameters lMSigParameters, LMSigParameters.AnonymousClass1 anonymousClass1, LMSigParameters lMSigParameters2) {
        anonymousClass1.put(Integer.valueOf(lMSigParameters.type), lMSigParameters2);
    }

    public static /* synthetic */ boolean x(AtomicReferenceArray atomicReferenceArray, int i, Task task) {
        while (!atomicReferenceArray.compareAndSet(i, task, null)) {
            if (atomicReferenceArray.get(i) != task) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, CancellableContinuationImpl cancellableContinuationImpl, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cancellableContinuationImpl, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(cancellableContinuationImpl) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, ChannelSegment channelSegment) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, channelSegment)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }
}

package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.NetworkRequestCompatKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "BackoffPolicyIds", "NetworkTypeIds", "OutOfPolicyIds", "StateIds", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkTypeConverters {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$BackoffPolicyIds;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BackoffPolicyIds {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$NetworkTypeIds;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class NetworkTypeIds {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$OutOfPolicyIds;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class OutOfPolicyIds {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class StateIds {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static final LinkedHashSet a(byte[] bytes) throws IOException {
        Intrinsics.h(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        Intrinsics.g(uri, "uri");
                        linkedHashSet.add(new Constraints.ContentUriTrigger(z, uri));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final byte[] b(NetworkRequestCompat requestCompat) throws IOException {
        Intrinsics.h(requestCompat, "requestCompat");
        NetworkRequest networkRequest = (NetworkRequest) requestCompat.f3999a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrB = NetworkRequestCompatKt.b(networkRequest);
                int[] iArrA = NetworkRequestCompatKt.a(networkRequest);
                objectOutputStream.writeInt(iArrB.length);
                for (int i : iArrB) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrA.length);
                for (int i2 : iArrA) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.g(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final BackoffPolicy c(int i) {
        if (i == 0) {
            return BackoffPolicy.d;
        }
        if (i == 1) {
            return BackoffPolicy.e;
        }
        throw new IllegalArgumentException(YU.a.e(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final NetworkType d(int i) {
        if (i == 0) {
            return NetworkType.d;
        }
        if (i == 1) {
            return NetworkType.e;
        }
        if (i == 2) {
            return NetworkType.f;
        }
        if (i == 3) {
            return NetworkType.g;
        }
        if (i == 4) {
            return NetworkType.h;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(YU.a.e(i, "Could not convert ", " to NetworkType"));
        }
        return NetworkType.i;
    }

    public static final OutOfQuotaPolicy e(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.d;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.e;
        }
        throw new IllegalArgumentException(YU.a.e(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final WorkInfo.State f(int i) {
        if (i == 0) {
            return WorkInfo.State.d;
        }
        if (i == 1) {
            return WorkInfo.State.e;
        }
        if (i == 2) {
            return WorkInfo.State.f;
        }
        if (i == 3) {
            return WorkInfo.State.g;
        }
        if (i == 4) {
            return WorkInfo.State.h;
        }
        if (i == 5) {
            return WorkInfo.State.i;
        }
        throw new IllegalArgumentException(YU.a.e(i, "Could not convert ", " to State"));
    }

    public static final int g(NetworkType networkType) {
        Intrinsics.h(networkType, "networkType");
        int iOrdinal = networkType.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.i) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                }
            }
        }
        return i;
    }

    public static final byte[] h(Set triggers) throws IOException {
        Intrinsics.h(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    Constraints.ContentUriTrigger contentUriTrigger = (Constraints.ContentUriTrigger) it.next();
                    objectOutputStream.writeUTF(contentUriTrigger.getF3895a().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.getB());
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.g(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int i(WorkInfo.State state) {
        Intrinsics.h(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i;
    }

    public static final NetworkRequestCompat j(byte[] bytes) throws IOException {
        Intrinsics.h(bytes, "bytes");
        if (bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatA = NetworkRequest28.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return networkRequestCompatA;
            } finally {
            }
        } finally {
        }
    }
}

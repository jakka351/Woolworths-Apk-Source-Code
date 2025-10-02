package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firestore.v1.BatchGetDocumentsResponse;
import io.grpc.Status;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class Datastore {
    public static final HashSet d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a, reason: collision with root package name */
    public final RemoteSerializer f15566a;
    public final AsyncQueue b;
    public final FirestoreChannel c;

    /* renamed from: com.google.firebase.firestore.remote.Datastore$1, reason: invalid class name */
    class AnonymousClass1 extends FirestoreChannel.StreamingListener<BatchGetDocumentsResponse> {
    }

    /* renamed from: com.google.firebase.firestore.remote.Datastore$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15567a;

        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            f15567a = iArr;
            try {
                FirebaseFirestoreException.Code code = FirebaseFirestoreException.Code.OK;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f15567a;
                FirebaseFirestoreException.Code code2 = FirebaseFirestoreException.Code.OK;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f15567a;
                FirebaseFirestoreException.Code code3 = FirebaseFirestoreException.Code.OK;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f15567a;
                FirebaseFirestoreException.Code code4 = FirebaseFirestoreException.Code.OK;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f15567a;
                FirebaseFirestoreException.Code code5 = FirebaseFirestoreException.Code.OK;
                iArr5[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f15567a;
                FirebaseFirestoreException.Code code6 = FirebaseFirestoreException.Code.OK;
                iArr6[13] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f15567a;
                FirebaseFirestoreException.Code code7 = FirebaseFirestoreException.Code.OK;
                iArr7[14] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f15567a;
                FirebaseFirestoreException.Code code8 = FirebaseFirestoreException.Code.OK;
                iArr8[16] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f15567a;
                FirebaseFirestoreException.Code code9 = FirebaseFirestoreException.Code.OK;
                iArr9[3] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f15567a;
                FirebaseFirestoreException.Code code10 = FirebaseFirestoreException.Code.OK;
                iArr10[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f15567a;
                FirebaseFirestoreException.Code code11 = FirebaseFirestoreException.Code.OK;
                iArr11[6] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f15567a;
                FirebaseFirestoreException.Code code12 = FirebaseFirestoreException.Code.OK;
                iArr12[7] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = f15567a;
                FirebaseFirestoreException.Code code13 = FirebaseFirestoreException.Code.OK;
                iArr13[9] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = f15567a;
                FirebaseFirestoreException.Code code14 = FirebaseFirestoreException.Code.OK;
                iArr14[10] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = f15567a;
                FirebaseFirestoreException.Code code15 = FirebaseFirestoreException.Code.OK;
                iArr15[11] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = f15567a;
                FirebaseFirestoreException.Code code16 = FirebaseFirestoreException.Code.OK;
                iArr16[12] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = f15567a;
                FirebaseFirestoreException.Code code17 = FirebaseFirestoreException.Code.OK;
                iArr17[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public Datastore(AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, FirestoreChannel firestoreChannel) {
        this.b = asyncQueue;
        this.f15566a = remoteSerializer;
        this.c = firestoreChannel;
    }

    public static boolean a(Status status) {
        FirebaseFirestoreException.Code code = (FirebaseFirestoreException.Code) FirebaseFirestoreException.Code.g.get(status.f23971a.d, FirebaseFirestoreException.Code.UNKNOWN);
        switch (code) {
            case OK:
                throw new IllegalArgumentException("Treated status OK as error");
            case CANCELLED:
            case UNKNOWN:
            case DEADLINE_EXCEEDED:
            case RESOURCE_EXHAUSTED:
            case INTERNAL:
            case UNAVAILABLE:
            case UNAUTHENTICATED:
                return false;
            case INVALID_ARGUMENT:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case PERMISSION_DENIED:
            case FAILED_PRECONDITION:
            case ABORTED:
            case OUT_OF_RANGE:
            case UNIMPLEMENTED:
            case DATA_LOSS:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + code);
        }
    }
}

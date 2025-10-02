package com.squareup.sqldelight;

import androidx.constraintlayout.core.state.a;
import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0004H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/squareup/sqldelight/TransacterImpl;", "Lcom/squareup/sqldelight/Transacter;", "", "identifier", "Lkotlin/Function0;", "", "Lcom/squareup/sqldelight/Query;", "queryList", "", "notifyQueries", "(ILkotlin/jvm/functions/Function0;)V", "count", "", "createArguments", "(I)Ljava/lang/String;", "", "noEnclosing", "Lkotlin/Function1;", "Lcom/squareup/sqldelight/TransactionWithoutReturn;", "Lkotlin/ExtensionFunctionType;", "body", "transaction", "(ZLkotlin/jvm/functions/Function1;)V", "R", "Lcom/squareup/sqldelight/TransactionWithReturn;", "bodyWithReturn", "transactionWithResult", "(ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/squareup/sqldelight/db/SqlDriver;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TransacterImpl implements Transacter {

    @NotNull
    private final SqlDriver driver;

    public TransacterImpl(SqlDriver driver) {
        Intrinsics.h(driver, "driver");
        this.driver = driver;
    }

    public final Object a(Function1 function1, boolean z) throws Throwable {
        Transacter.Transaction transactionL1 = this.driver.L1();
        Transacter.Transaction g = transactionL1.getG();
        long j = transactionL1.f19030a;
        ArrayList arrayList = transactionL1.c;
        ArrayList arrayList2 = transactionL1.b;
        LinkedHashMap linkedHashMap = transactionL1.d;
        if (g != null && z) {
            throw new IllegalStateException("Already in a transaction");
        }
        boolean z2 = false;
        try {
            Object objInvoke = function1.invoke(new TransactionWrapper());
            transactionL1.e = true;
            if (j != Thread.currentThread().getId()) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            }
            transactionL1.a(transactionL1.e && transactionL1.f);
            if (g != null) {
                if (transactionL1.e && transactionL1.f) {
                    z2 = true;
                }
                g.f = z2;
                g.b.addAll(arrayList2);
                g.c.addAll(arrayList);
                g.d.putAll(linkedHashMap);
                return objInvoke;
            }
            if (!transactionL1.e || !transactionL1.f) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                arrayList.clear();
                return objInvoke;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                CollectionsKt.h((List) ((Function0) ((Map.Entry) it2.next()).getValue()).invoke(), arrayList3);
            }
            Iterator it3 = CollectionsKt.w(arrayList3).iterator();
            while (it3.hasNext()) {
                ((Query) it3.next()).notifyDataChanged();
            }
            linkedHashMap.clear();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((Function0) it4.next()).invoke();
            }
            arrayList2.clear();
            return objInvoke;
        } catch (Throwable th) {
            if (j != Thread.currentThread().getId()) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            }
            transactionL1.a(transactionL1.e && transactionL1.f);
            if (g != null) {
                if (transactionL1.e && transactionL1.f) {
                    z2 = true;
                }
                g.f = z2;
                g.b.addAll(arrayList2);
                g.c.addAll(arrayList);
                g.d.putAll(linkedHashMap);
            } else if (transactionL1.e && transactionL1.f) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = linkedHashMap.entrySet().iterator();
                while (it5.hasNext()) {
                    CollectionsKt.h((List) ((Function0) ((Map.Entry) it5.next()).getValue()).invoke(), arrayList4);
                }
                Iterator it6 = CollectionsKt.w(arrayList4).iterator();
                while (it6.hasNext()) {
                    ((Query) it6.next()).notifyDataChanged();
                }
                linkedHashMap.clear();
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    ((Function0) it7.next()).invoke();
                }
                arrayList2.clear();
            } else {
                try {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        ((Function0) it8.next()).invoke();
                    }
                    arrayList.clear();
                } catch (Throwable th2) {
                    throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th + "\nwith cause " + th.getCause() + "\n\nRollback exception: " + th2, th2);
                }
            }
            if (g == null && (th instanceof RollbackException)) {
                return null;
            }
            throw th;
        }
    }

    @NotNull
    public final String createArguments(int count) {
        if (count == 0) {
            return "()";
        }
        StringBuilder sbO = a.o(count + 2, "(?");
        int i = count - 1;
        for (int i2 = 0; i2 < i; i2++) {
            sbO.append(",?");
        }
        sbO.append(')');
        String string = sbO.toString();
        Intrinsics.g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final void notifyQueries(int identifier, @NotNull Function0<? extends List<? extends Query<?>>> queryList) {
        Intrinsics.h(queryList, "queryList");
        Transacter.Transaction transactionX0 = this.driver.x0();
        if (transactionX0 == null) {
            Iterator it = ((Iterable) queryList.invoke()).iterator();
            while (it.hasNext()) {
                ((Query) it.next()).notifyDataChanged();
            }
        } else {
            LinkedHashMap linkedHashMap = transactionX0.d;
            if (linkedHashMap.containsKey(Integer.valueOf(identifier))) {
                return;
            }
            linkedHashMap.put(Integer.valueOf(identifier), queryList);
        }
    }

    @Override // com.squareup.sqldelight.Transacter
    public void transaction(boolean noEnclosing, @NotNull Function1<? super TransactionWithoutReturn, Unit> body) throws Throwable {
        Intrinsics.h(body, "body");
        a(body, noEnclosing);
    }

    @Override // com.squareup.sqldelight.Transacter
    public <R> R transactionWithResult(boolean noEnclosing, @NotNull Function1<? super TransactionWithReturn<R>, ? extends R> bodyWithReturn) {
        Intrinsics.h(bodyWithReturn, "bodyWithReturn");
        return (R) a(bodyWithReturn, noEnclosing);
    }
}

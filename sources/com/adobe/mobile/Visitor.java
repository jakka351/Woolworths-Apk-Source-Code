package com.adobe.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public final class Visitor {

    /* renamed from: com.adobe.mobile.Visitor$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                com.adobe.mobile.VisitorIDService r0 = com.adobe.mobile.VisitorIDService.i()
                r0.getClass()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r2 = "ID Service - error retrieving AID (%s)"
                com.adobe.mobile.VisitorIDService$12 r3 = new com.adobe.mobile.VisitorIDService$12
                r3.<init>()
                r4 = 0
                java.lang.String r2 = com.adobe.mobile.VisitorIDService.c(r3)     // Catch: java.util.concurrent.TimeoutException -> L1b java.util.concurrent.ExecutionException -> L2a java.lang.InterruptedException -> L37
                goto L44
            L1b:
                r2 = move-exception
                java.lang.String r2 = r2.getLocalizedMessage()
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                java.lang.String r3 = "ID Service - Timeout exceeded when retrieving AID (%s)"
                com.adobe.mobile.StaticMethods.J(r3, r2)
                goto L43
            L2a:
                r3 = move-exception
                java.lang.String r3 = r3.getLocalizedMessage()
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                com.adobe.mobile.StaticMethods.J(r2, r3)
                goto L43
            L37:
                r3 = move-exception
                java.lang.String r3 = r3.getLocalizedMessage()
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                com.adobe.mobile.StaticMethods.J(r2, r3)
            L43:
                r2 = r4
            L44:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r3 = "ID Service - error retrieving VID (%s)"
                com.adobe.mobile.VisitorIDService$13 r5 = new com.adobe.mobile.VisitorIDService$13
                r5.<init>()
                java.lang.String r3 = com.adobe.mobile.VisitorIDService.c(r5)     // Catch: java.util.concurrent.TimeoutException -> L52 java.util.concurrent.ExecutionException -> L61 java.lang.InterruptedException -> L6e
                goto L7b
            L52:
                r3 = move-exception
                java.lang.String r3 = r3.getLocalizedMessage()
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r5 = "ID Service - Timeout exceeded when retrieving VID (%s)"
                com.adobe.mobile.StaticMethods.J(r5, r3)
                goto L7a
            L61:
                r5 = move-exception
                java.lang.String r5 = r5.getLocalizedMessage()
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                com.adobe.mobile.StaticMethods.J(r3, r5)
                goto L7a
            L6e:
                r5 = move-exception
                java.lang.String r5 = r5.getLocalizedMessage()
                java.lang.Object[] r5 = new java.lang.Object[]{r5}
                com.adobe.mobile.StaticMethods.J(r3, r5)
            L7a:
                r3 = r4
            L7b:
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.lang.String r5 = "ID Service - error retrieving MID (%s)"
                com.adobe.mobile.VisitorIDService$14 r6 = new com.adobe.mobile.VisitorIDService$14
                r6.<init>()
                java.lang.String r0 = com.adobe.mobile.VisitorIDService.c(r6)     // Catch: java.util.concurrent.TimeoutException -> L89 java.util.concurrent.ExecutionException -> L98 java.lang.InterruptedException -> La5
                goto Lb2
            L89:
                r0 = move-exception
                java.lang.String r0 = r0.getLocalizedMessage()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r5 = "ID Service - Timeout exceeded when retrieving MID (%s)"
                com.adobe.mobile.StaticMethods.J(r5, r0)
                goto Lb1
            L98:
                r0 = move-exception
                java.lang.String r0 = r0.getLocalizedMessage()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                com.adobe.mobile.StaticMethods.J(r5, r0)
                goto Lb1
            La5:
                r0 = move-exception
                java.lang.String r0 = r0.getLocalizedMessage()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                com.adobe.mobile.StaticMethods.J(r5, r0)
            Lb1:
                r0 = r4
            Lb2:
                com.adobe.mobile.MobileConfig r5 = com.adobe.mobile.MobileConfig.b()
                java.lang.String r5 = r5.B
                long r6 = com.adobe.mobile.StaticMethods.E()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.String r7 = "TS"
                java.lang.String r6 = com.adobe.mobile.VisitorIDService.a(r4, r7, r6)
                java.lang.String r7 = "MCMID"
                java.lang.String r0 = com.adobe.mobile.VisitorIDService.a(r6, r7, r0)
                java.lang.String r6 = "MCAID"
                java.lang.String r0 = com.adobe.mobile.VisitorIDService.a(r0, r6, r2)
                java.lang.String r2 = "MCORGID"
                java.lang.String r0 = com.adobe.mobile.VisitorIDService.a(r0, r2, r5)
                java.lang.String r2 = "adobe_mc="
                r1.append(r2)
                java.lang.String r0 = com.adobe.mobile.StaticMethods.a(r0)
                r1.append(r0)
                if (r3 == 0) goto Lf8
                int r0 = r3.length()
                if (r0 <= 0) goto Lf8
                java.lang.String r0 = "&adobe_aa_vid="
                r1.append(r0)
                java.lang.String r0 = com.adobe.mobile.StaticMethods.a(r3)
                r1.append(r0)
            Lf8:
                r1.length()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.Visitor.AnonymousClass1.run():void");
        }
    }

    public interface VisitorCallback {
    }

    public static List a() {
        VisitorIDService visitorIDServiceI = VisitorIDService.i();
        visitorIDServiceI.getClass();
        FutureTask futureTask = new FutureTask(new Callable<List<VisitorID>>() { // from class: com.adobe.mobile.VisitorIDService.5
            public AnonymousClass5() {
            }

            @Override // java.util.concurrent.Callable
            public final List<VisitorID> call() {
                return new ArrayList(VisitorIDService.this.i);
            }
        });
        visitorIDServiceI.j.execute(futureTask);
        try {
            return (List) futureTask.get();
        } catch (Exception e) {
            StaticMethods.K("ID Service - Unable to retrieve marketing cloud identifiers from queue(%s)", e.getLocalizedMessage());
            return null;
        }
    }
}

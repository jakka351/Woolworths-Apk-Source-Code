package com.apollographql.apollo.ast.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/ast/internal/Lexer;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Lexer {

    /* renamed from: a, reason: collision with root package name */
    public final String f13575a;
    public int b;
    public final int c;
    public int d;
    public int e;
    public boolean f;

    public Lexer(String src) {
        Intrinsics.h(src, "src");
        this.f13575a = src;
        this.c = src.length();
        this.d = 1;
    }

    public static int b(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static boolean c(char c) {
        return '0' <= c && c < ':';
    }

    public final int a(int i) {
        return (i - this.e) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r20 = r2;
        r19 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x037a, code lost:
    
        r1 = (r28.b - r6) - 4;
        r3 = new java.lang.StringBuilder("Invalid Unicode escape '");
        r4 = r4.substring(r1, r28.b);
        kotlin.jvm.internal.Intrinsics.g(r4, "substring(...)");
        r3.append(r4);
        r3.append('\'');
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03a4, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r1, r28.d, a(r1), r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0546, code lost:
    
        r2 = r28.b - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0555, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r2, r28.d, a(r2), "Unterminated string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x063e, code lost:
    
        r1 = r28.b;
        r2 = r20;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0643, code lost:
    
        r5 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0647, code lost:
    
        if (r5 >= r3) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0649, code lost:
    
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x064b, code lost:
    
        if (r2 != r10) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0651, code lost:
    
        if (r4.charAt(r5) != '-') goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0653, code lost:
    
        r28.b += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0658, code lost:
    
        r20 = r10;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x065d, code lost:
    
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x065f, code lost:
    
        if (r2 != r13) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0661, code lost:
    
        r2 = r4.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0665, code lost:
    
        if (r2 != r11) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0667, code lost:
    
        r2 = r28.b + r10;
        r28.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x066c, code lost:
    
        if (r2 != r3) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0670, code lost:
    
        r2 = r4.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0676, code lost:
    
        if (r28.b >= r3) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x067c, code lost:
    
        if (c(r2) != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x067f, code lost:
    
        r2 = "Invalid number, unexpected digit after 0: '" + r2 + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x069f, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06a0, code lost:
    
        r19 = r13;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x06a4, code lost:
    
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x06ab, code lost:
    
        if (c(r2) == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06ad, code lost:
    
        r28.b++;
        r19 = r13;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06ba, code lost:
    
        r2 = "Invalid number, expected digit but got '" + r2 + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06d8, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06d9, code lost:
    
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06db, code lost:
    
        if (r2 != r10) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x06e5, code lost:
    
        if (c(r4.charAt(r5)) == false) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06e7, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06f1, code lost:
    
        r20 = 1;
        r18 = r10;
        r19 = r13;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06fb, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0702, code lost:
    
        if (r2 != r13) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0708, code lost:
    
        if (r4.charAt(r5) != '.') goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x070a, code lost:
    
        r2 = r28.b + 1;
        r28.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0710, code lost:
    
        if (r2 == r3) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0712, code lost:
    
        r2 = r4.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x071a, code lost:
    
        if (c(r2) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x071c, code lost:
    
        r28.b++;
        r2 = 5;
        r17 = r13;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0726, code lost:
    
        r18 = 4;
        r19 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x072c, code lost:
    
        r2 = "Invalid number, expected digit but got '" + r2 + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x074a, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0756, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r1, r28.d, a(r1), "Unterminated number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0757, code lost:
    
        r17 = r13;
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x075f, code lost:
    
        if (r2 != 8) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0761, code lost:
    
        r2 = r4.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0767, code lost:
    
        if (r2 == 'E') goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x076b, code lost:
    
        if (r2 == 'e') goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x076f, code lost:
    
        r2 = r28.b + 1;
        r28.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0777, code lost:
    
        if (r2 == r3) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0779, code lost:
    
        r2 = 6;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x077b, code lost:
    
        r11 = '0';
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x078b, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r1, r28.d, a(r1), "Unterminated number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x078d, code lost:
    
        if (r2 != 6) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x078f, code lost:
    
        r2 = r4.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0795, code lost:
    
        if (r2 == '+') goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0797, code lost:
    
        if (r2 == '-') goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x079d, code lost:
    
        if (c(r2) == false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x079f, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07a7, code lost:
    
        r2 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07a9, code lost:
    
        r2 = "Invalid number, expected digit but got '" + r2 + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x07c7, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x07c8, code lost:
    
        r2 = r28.b + 1;
        r28.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07d0, code lost:
    
        if (r2 == r3) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x07d2, code lost:
    
        r2 = r4.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07da, code lost:
    
        if (c(r2) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x07dc, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07e3, code lost:
    
        r2 = "Invalid number, expected digit but got '" + r2 + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0801, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x080d, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r1, r28.d, a(r1), "Unterminated number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x080e, code lost:
    
        if (r2 != 7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0818, code lost:
    
        if (c(r4.charAt(r5)) == false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x081a, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0826, code lost:
    
        if (r2 != 5) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0830, code lost:
    
        if (c(r4.charAt(r5)) == false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0832, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x083a, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x083e, code lost:
    
        r2 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0840, code lost:
    
        if (r2 >= r3) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0846, code lost:
    
        if (r4.charAt(r2) == '.') goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0848, code lost:
    
        r2 = r4.charAt(r28.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0850, code lost:
    
        if (r2 == '_') goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0854, code lost:
    
        if ('A' > r2) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0856, code lost:
    
        if (r2 < '[') goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x085a, code lost:
    
        if ('a' > r2) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x085e, code lost:
    
        if (r2 < '{') goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0861, code lost:
    
        r2 = "Invalid number, expected digit but got '" + r4.charAt(r28.b) + '\'';
        r3 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0885, code lost:
    
        throw new com.apollographql.apollo.ast.internal.LexerException(r3, r28.d, a(r3), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0886, code lost:
    
        r3 = r4.substring(r1, r28.b);
        kotlin.jvm.internal.Intrinsics.g(r3, "substring(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x088f, code lost:
    
        if (r7 == false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x089f, code lost:
    
        return new com.apollographql.apollo.ast.internal.Token.Float(r3, r1, r28.b, r28.d, a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x08ae, code lost:
    
        return new com.apollographql.apollo.ast.internal.Token.Int(r3, r1, r28.b, r28.d, a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08af, code lost:
    
        r5 = r28.b;
        r28.b = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x08b5, code lost:
    
        r1 = r28.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x08b7, code lost:
    
        if (r1 >= r3) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x08b9, code lost:
    
        r1 = r4.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08c1, code lost:
    
        if (r1 == '_') goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08c3, code lost:
    
        if ('0' > r1) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x08c5, code lost:
    
        if (r1 >= ':') goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x08d0, code lost:
    
        if ('A' > r1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x08d2, code lost:
    
        if (r1 >= '[') goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x08d7, code lost:
    
        if ('a' > r1) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x08db, code lost:
    
        if (r1 >= '{') goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x08dd, code lost:
    
        r28.b++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x08e6, code lost:
    
        r6 = r28.b;
        r7 = r28.d;
        r8 = a(r5);
        r4 = r4.substring(r5, r28.b);
        kotlin.jvm.internal.Intrinsics.g(r4, "substring(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x08fc, code lost:
    
        return new com.apollographql.apollo.ast.internal.Token.Name(r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.apollographql.apollo.ast.internal.Token d() {
        /*
            Method dump skipped, instructions count: 2338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ast.internal.Lexer.d():com.apollographql.apollo.ast.internal.Token");
    }

    public final int e() throws LexerException {
        if (this.b + 4 >= this.c) {
            int i = this.b;
            throw new LexerException(i, this.d, a(i), "Unterminated Unicode escape");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = this.b;
            this.b = i4 + 1;
            String str = this.f13575a;
            int iB = b(str.charAt(i4));
            if (iB == -1) {
                int i5 = (this.b - i3) - 3;
                StringBuilder sb = new StringBuilder("Invalid Unicode escape '");
                String strSubstring = str.substring(i5, this.b);
                Intrinsics.g(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append('\'');
                throw new LexerException(i5, this.d, a(i5), sb.toString());
            }
            i2 = (i2 << 4) | iB;
        }
        return i2;
    }
}

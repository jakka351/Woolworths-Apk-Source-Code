package org.commonmark.internal.util;

import org.commonmark.parser.beta.Scanner;

/* loaded from: classes8.dex */
public class LinkScanner {
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(org.commonmark.parser.beta.Scanner r8) {
        /*
            boolean r0 = r8.d()
            r1 = 0
            if (r0 != 0) goto L9
            goto L7e
        L9:
            r0 = 60
            boolean r2 = r8.h(r0)
            r3 = 1
            r4 = 92
            if (r2 == 0) goto L4a
        L14:
            boolean r2 = r8.d()
            if (r2 == 0) goto L7e
            char r2 = r8.j()
            r5 = 10
            if (r2 == r5) goto L7e
            if (r2 == r0) goto L7e
            r5 = 62
            if (r2 == r5) goto L46
            if (r2 == r4) goto L2e
            r8.g()
            goto L14
        L2e:
            r8.g()
            char r2 = r8.j()
            switch(r2) {
                case 33: goto L42;
                case 34: goto L42;
                case 35: goto L42;
                case 36: goto L42;
                case 37: goto L42;
                case 38: goto L42;
                case 39: goto L42;
                case 40: goto L42;
                case 41: goto L42;
                case 42: goto L42;
                case 43: goto L42;
                case 44: goto L42;
                case 45: goto L42;
                case 46: goto L42;
                case 47: goto L42;
                default: goto L38;
            }
        L38:
            switch(r2) {
                case 58: goto L42;
                case 59: goto L42;
                case 60: goto L42;
                case 61: goto L42;
                case 62: goto L42;
                case 63: goto L42;
                case 64: goto L42;
                default: goto L3b;
            }
        L3b:
            switch(r2) {
                case 91: goto L42;
                case 92: goto L42;
                case 93: goto L42;
                case 94: goto L42;
                case 95: goto L42;
                case 96: goto L42;
                default: goto L3e;
            }
        L3e:
            switch(r2) {
                case 123: goto L42;
                case 124: goto L42;
                case 125: goto L42;
                case 126: goto L42;
                default: goto L41;
            }
        L41:
            goto L14
        L42:
            r8.g()
            goto L14
        L46:
            r8.g()
            return r3
        L4a:
            r2 = r1
            r0 = r3
        L4c:
            boolean r5 = r8.d()
            if (r5 == 0) goto L9f
            char r5 = r8.j()
            r6 = 32
            if (r5 == r6) goto L9c
            if (r5 == r4) goto L83
            r7 = 40
            if (r5 == r7) goto L7a
            r6 = 41
            if (r5 == r6) goto L71
            boolean r5 = java.lang.Character.isISOControl(r5)
            if (r5 == 0) goto L6d
            r8 = r0 ^ 1
            return r8
        L6d:
            r8.g()
            goto L9a
        L71:
            if (r2 != 0) goto L74
            goto L9f
        L74:
            int r2 = r2 + (-1)
            r8.g()
            goto L9a
        L7a:
            int r2 = r2 + 1
            if (r2 <= r6) goto L7f
        L7e:
            return r1
        L7f:
            r8.g()
            goto L9a
        L83:
            r8.g()
            char r0 = r8.j()
            switch(r0) {
                case 33: goto L97;
                case 34: goto L97;
                case 35: goto L97;
                case 36: goto L97;
                case 37: goto L97;
                case 38: goto L97;
                case 39: goto L97;
                case 40: goto L97;
                case 41: goto L97;
                case 42: goto L97;
                case 43: goto L97;
                case 44: goto L97;
                case 45: goto L97;
                case 46: goto L97;
                case 47: goto L97;
                default: goto L8d;
            }
        L8d:
            switch(r0) {
                case 58: goto L97;
                case 59: goto L97;
                case 60: goto L97;
                case 61: goto L97;
                case 62: goto L97;
                case 63: goto L97;
                case 64: goto L97;
                default: goto L90;
            }
        L90:
            switch(r0) {
                case 91: goto L97;
                case 92: goto L97;
                case 93: goto L97;
                case 94: goto L97;
                case 95: goto L97;
                case 96: goto L97;
                default: goto L93;
            }
        L93:
            switch(r0) {
                case 123: goto L97;
                case 124: goto L97;
                case 125: goto L97;
                case 126: goto L97;
                default: goto L96;
            }
        L96:
            goto L9a
        L97:
            r8.g()
        L9a:
            r0 = r1
            goto L4c
        L9c:
            r8 = r0 ^ 1
            return r8
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.util.LinkScanner.a(org.commonmark.parser.beta.Scanner):boolean");
    }

    public static boolean b(Scanner scanner) {
        while (scanner.d()) {
            switch (scanner.j()) {
                case '[':
                    return false;
                case '\\':
                    scanner.g();
                    char cJ = scanner.j();
                    switch (cJ) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            scanner.g();
                            break;
                        default:
                            switch (cJ) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    scanner.g();
                                    break;
                                default:
                                    switch (cJ) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            scanner.g();
                                            break;
                                        default:
                                            switch (cJ) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    scanner.g();
                                                    break;
                                            }
                                    }
                            }
                    }
                case ']':
                    return true;
                default:
                    scanner.g();
                    break;
            }
        }
        return true;
    }

    public static boolean c(Scanner scanner, char c) {
        while (scanner.d()) {
            char cJ = scanner.j();
            if (cJ == '\\') {
                scanner.g();
                char cJ2 = scanner.j();
                switch (cJ2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                        scanner.g();
                        break;
                    default:
                        switch (cJ2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                scanner.g();
                                break;
                            default:
                                switch (cJ2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        scanner.g();
                                        break;
                                    default:
                                        switch (cJ2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                scanner.g();
                                                break;
                                        }
                                }
                        }
                }
            } else {
                if (cJ == c) {
                    return true;
                }
                if (c == ')' && cJ == '(') {
                    return false;
                }
                scanner.g();
            }
        }
        return true;
    }
}

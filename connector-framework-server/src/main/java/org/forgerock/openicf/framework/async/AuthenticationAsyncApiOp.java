/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2015 ForgeRock AS. All rights reserved.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 */

package org.forgerock.openicf.framework.async;

import org.forgerock.util.promise.Promise;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.api.operations.AuthenticationApiOp;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.Uid;

/**
 * {@inheritDoc}
 *
 * @since 1.5
 */
public interface AuthenticationAsyncApiOp extends AuthenticationApiOp {

    /**
     * Most basic authentication available.
     *
     * @param objectClass
     *            The object class to use for authenticate. Will typically be an
     *            account. Must not be null.
     * @param username
     *            string that represents the account or user id.
     * @param password
     *            string that represents the password for the account or user.
     * @param options
     *            additional options that impact the way this operation is run.
     *            May be null.
     * @return Uid The uid of the account that was used to authenticate
     * @throws RuntimeException
     *             if the credentials do not pass authentication otherwise
     *             nothing.
     */
    public Promise<Uid, RuntimeException> authenticateAsync(ObjectClass objectClass,
            String username, GuardedString password, OperationOptions options);
}

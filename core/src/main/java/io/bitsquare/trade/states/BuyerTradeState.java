/*
 * This file is part of Bitsquare.
 *
 * Bitsquare is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bitsquare is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bitsquare. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bitsquare.trade.states;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyerTradeState {
    private static final Logger log = LoggerFactory.getLogger(BuyerTradeState.class);

    public enum ProcessState implements TradeState.ProcessState {
        UNDEFINED,

        DEPOSIT_PUBLISHED,
        DEPOSIT_PUBLISHED_MSG_SENT,
        DEPOSIT_CONFIRMED,

        FIAT_PAYMENT_STARTED,
        FIAT_PAYMENT_STARTED_MSG_SENT,

        FIAT_PAYMENT_RECEIPT_MSG_RECEIVED,

        PAYOUT_TX_COMMITTED,
        PAYOUT_TX_SENT,

        PAYOUT_BROAD_CASTED,

        TIMEOUT,
        FAULT
    }
}

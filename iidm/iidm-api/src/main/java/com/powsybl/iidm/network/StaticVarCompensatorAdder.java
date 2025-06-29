/**
 * Copyright (c) 2016, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * SPDX-License-Identifier: MPL-2.0
 */
package com.powsybl.iidm.network;

/**
 * @author Geoffroy Jamgotchian {@literal <geoffroy.jamgotchian at rte-france.com>}
 */
public interface StaticVarCompensatorAdder extends InjectionAdder<StaticVarCompensator, StaticVarCompensatorAdder> {

    StaticVarCompensatorAdder setBmin(double bMin);

    StaticVarCompensatorAdder setBmax(double bMax);

    StaticVarCompensatorAdder setVoltageSetpoint(double voltageSetpoint);

    StaticVarCompensatorAdder setReactivePowerSetpoint(double reactivePowerSetpoint);

    StaticVarCompensatorAdder setRegulationMode(StaticVarCompensator.RegulationMode regulationMode);

    StaticVarCompensatorAdder setRegulating(boolean regulating);

    default StaticVarCompensatorAdder setRegulatingTerminal(Terminal regulatingTerminal) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    StaticVarCompensator add();
}

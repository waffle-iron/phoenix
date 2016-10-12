/*
 * Copyright (c) 2016 Sandia Corporation. All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by the
 * terms of this license.
 * You must not remove this notice, or any other, from this software.
 *
 * Contributors:
 * - Mark Bastian: Original author.
 * - See Git logs.
 */

package gov.sandia.phoenix.propagators

import gov.sandia.phoenix.elements.sv.ECIStateVector
import gov.sandia.phoenix.time._

/**
 * <p>A simple propagator for propagating an ECI State Vector.
 * <p>
 * @author <a href="mailto:markbastian@gmail.com">Mark Bastian</a>
 */
case class ECIStateVectorPropagator(epoch: JD,
  state: ECIStateVector) extends Propagator {
  def state(t: JD) = Some(state.state(t.delta(epoch).doubleValue()))
  def pretty = epoch + ": " + state
}